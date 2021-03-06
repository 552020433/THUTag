package org.thunlp.matrix;

public interface MatrixInterface {
	double get(int row, int col);

	void set(int row, int col, double value);

	void add(int row, int col, double value);

	// 行数
	int getRowsCount();

	// 列数
	int getColsCount();

	// 转置
	void inv();

	// 乘，返回的数组应与vector不同
	public double[] multiply(double[] vector);
}
