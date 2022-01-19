// sizeava Program to Remove Duplicate Elements
// From the Array using extra space

/**
 * DuplicateValues
*/
public class DuplicateValues {

	public static int removeDuplicates(int a[], int n)
	{

		if (n == 0 || n == 1) { // return array if have only one element or empty array.
			return n;
		}

		int size = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[size++] = a[i];
			}
		}

		a[size++] = a[n - 1];

		return size;
	}

	public static void main(String[] args)
	{
		int a[] = { 12,45,12,12,45,36,78,89 };
		int n = a.length;
		int size=0;
		size = removeDuplicates(a, n);
		for (int i = 0; i < size; i++)
			System.out.print(a[i] + " ");
	}
}
