package com.android.sumita.costgrid;


public class CalculatePath {


  // Calculate shortest path
  public static void FindshortPath(int[][] matrix) {

    int i = 1, j = 1, n = 0, k = 0;
    int currentRow = 1, currentCol = 1;    // The one element which our pointer is at currently
    int CostTotal = matrix[i][j];


    int iRowSize = matrix.length;   // Calculate row size of array.
    int iColSize = matrix[0].length; // Calculate column size of array. Assumption - No diff in size of columns per row.

    int PathSaverMatrix[][];
    PathSaverMatrix = new int[iColSize][iColSize + 1];      // allocate memory for storing elements


    for (int p=0;p<iRowSize-1;p++) {

      i=currentRow; j=currentCol;
      // Traverse columns till the column size
      for (k = 0; k < iColSize; k++) {

        n = 0;      // next path for path matrix
        if (matrix[i - 1][j + 1] <= matrix[i][j + 1])  // if up row elememt is low cost
        {

          CostTotal += matrix[i - 1][j + 1];
          PathSaverMatrix[k][n++] = matrix[i - 1][j + 1];
          currentRow = i - 1;
          currentCol = j + 1;
        } else {
          if (matrix[i][j + 1] <= matrix[i + 1][j + 1]) {

            CostTotal += matrix[i][j + 1];
            PathSaverMatrix[k][n++] = matrix[i][j + 1];
            currentRow = i;
            currentCol = j + 1;
          }
        }//for

      } //k-loop
    }//p-loop

    PathSaverMatrix[k - 1][iColSize] = CostTotal;
    GetMinPath( PathSaverMatrix);
  }


  protected static void GetMinPath(int PathSaverMatrix[][])
  {
    int iRowSize = PathSaverMatrix.length;   // Calculate row size of array.
    int iColSize = PathSaverMatrix[0].length; // Calculate column size of array. Assumption - No diff in size of columns per row.
    int minCost = PathSaverMatrix[0][iColSize-1];


    int i =0; int j= iColSize-1; int minRow=0;

    for ( i=0; i< iRowSize-1; i++){
           if (PathSaverMatrix[i][j] < PathSaverMatrix[i+1][j]) {
             minCost = PathSaverMatrix[i][j];
             minRow = i;
             }
      else
           {
             minCost = PathSaverMatrix[i+1][j];
             minRow = i+1;
           }
      }
  }//get min path

  // print Cost and elements, pass to DataCapture class for UI


  }


