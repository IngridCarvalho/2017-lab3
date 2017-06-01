package br.edu.univas.si3.lab3.chart;

import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Runner {

	public static void main(String[] args) {

		GraficoDeLinha chartBuilder = new GraficoDeLinha();

		//cria o gr�fico
		JFreeChart chart = chartBuilder.createChart("Gr�fico de Escolas");
		
		//salva a imagem do gr�fico
		chartBuilder.saveToFile("gr�ficoDeLinha.jpeg", chart);

		//cria um painel
		ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));

		//cria uma janena
		ApplicationFrame frame = new ApplicationFrame("Gr�fico Aula 10");
		frame.setContentPane(chartPanel);
		frame.pack();
		RefineryUtilities.centerFrameOnScreen(frame);
		frame.setVisible(true);
	}

}
