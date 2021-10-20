/*Goal: Learn to pass arrays to functions*/

#include<iostream>
#include<iomanip>

//Pass the array as a pointer
void arrayAsPointer(int *array, int size);
//Pass the array as a sized array
void arraySized(int array[3], int size);
//Pass the array as an unsized array
void arrayUnSized(int array[], int size);

void print2DArray(int **array, int width, int height);

int main()
{
    const int size = 3;
    int array[size] = {33,66,99};
    // int img[3][3] = {1,2,3,4,5,6,7,8,9};
    int** img = new int*[3];
    for (int i = 0; i < 3; i++) {
        img[i] = new int[3];
        for (int j = 0; j < 3; j++) {
            img[i][j] = i * 3 + j;
        }
    }
    //We are passing a pointer or reference to the array
    //so we will not know the size of the array
    //We have to pass the size to the function as well
    arrayAsPointer(array, size);
    arraySized(array, size);
    arrayUnSized(array, size);
    print2DArray(img, 3, 3);
    return 0;
}

void arrayAsPointer(int *array, int size)
{
    std::cout << std::setw(5);
    for(int i=0; i<size; i++) 
        std::cout << array[i] << " ";
    std::cout << "\n";
}

void arraySized(int array[3], int size)
{
    std::cout << std::setw(5);
    for(int i=0; i<size; i++)
        std::cout << array[i] << " ";
    std::cout << "\n";  
}

void arrayUnSized(int array[], int size)
{
    std::cout << std::setw(5);
    for(int i=0; i<size; i++)
        std::cout << array[i] << " ";
    std::cout << "\n";  
}

void print2DArray(int **array, int width, int height)
{
    for (int r = 0; r < height; r++) {
        for (int c = 0; c < width; c++) {
            std::cout << array[r][c] << "   ";
        }
        std::cout << std::endl;
    }
}

