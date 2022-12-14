package com.example.jsapertest;

import controllers.StudentController;
import entity.Student;
import entity.Subject;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.base.JRBaseTextElement;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@ComponentScan(basePackageClasses = StudentController.class)
public class JsaperTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsaperTestApplication.class, args);

//        try {
//            String filePath = "F:\\project tests\\jsaperTest\\src\\main\\resources\\First_Report.jrxml";
//
//            Map<String, Object> parameters = new HashMap<String, Object>();
//            parameters.put("studentName", "Meilleur");
//
//            Student student1 = new Student(1L, "Arel", "Meilleur", "Yaounde Cameroun",
//                    "Yaou");
//
//            Student student2 = new Student(2L, "Best", "dibeti", "Douala Cameroun",
//                    "Yaou");
//
//            List<Student> list = new ArrayList<Student>();
//            list.add(student1);
//            list.add(student2);
//
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
//
//            // Compilarion
//            JasperReport report = JasperCompileManager.compileReport(filePath);
//
//            //Changement de la couleur du nom
//            JRBaseTextElement textElement = (JRBaseTextElement) report.getTitle().getElementByKey("name");
//            textElement.setForecolor(Color.BLUE);
//
//            //Passage des données
//           JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
//
//
//           //Impréssion en pdf
//            JasperExportManager.exportReportToPdfFile(print, "F:\\project tests\\jsaperTest\\src\\main\\resources\\first.pdf");


//            String filePath = "F:\\project tests\\jsaperTest\\src\\main\\resources\\Student.jrxml";
//
//            Subject subject1 = new Subject("Java", 80);
//            Subject subject2 = new Subject("MySQL", 70);
//            Subject subject3 = new Subject("PHP", 50);
//            Subject subject4 = new Subject("MongoDB", 40);
//            Subject subject5 = new Subject("C++", 60);
//
//            List<Subject> list = new ArrayList<Subject>();
//            list.add(subject1);
//            list.add(subject2);
//            list.add(subject3);
//            list.add(subject4);
//            list.add(subject5);
//
//            JRBeanCollectionDataSource dataSource =
//                    new JRBeanCollectionDataSource(list);
//
//            JRBeanCollectionDataSource chartDataSource =
//                    new JRBeanCollectionDataSource(list);
//
//            Map<String, Object> parameters = new HashMap<String, Object>();
//            parameters.put("studentName", "Arel Keubou");
//            parameters.put("tableData", dataSource);
//
//            //Pour le subrepor
//            parameters.put("subReport", getSubReport());
//            parameters.put("subDataSource", getSuDataSource());
//            parameters.put("subParameters", getSubParameters());
//
//            JasperReport report = JasperCompileManager.compileReport(filePath);
//
////            JasperPrint print = JasperFillManager.fillReport(report, parameters, new JREmptyDataSource());
//            JasperPrint print = JasperFillManager.fillReport(report, parameters, chartDataSource);
//
//            // Export en pdf
//            JasperExportManager.exportReportToPdfFile(print, "F:\\project tests\\jsaperTest\\src\\main\\resources\\studentfirst.pdf");
//            // Export en html
//            JasperExportManager.exportReportToHtmlFile(print, "F:\\project tests\\jsaperTest\\src\\main\\resources\\studentfirst.html");
//
//            // Exportation en Excel
//
//            JRXlsxExporter exporter = new JRXlsxExporter();
//            exporter.setExporterInput(new SimpleExporterInput(print));
//            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(new FileOutputStream(new File("F:\\project tests\\jsaperTest\\src\\main\\resources\\studentfirst.xlsx"))));
//            exporter.exportReport();
//
//            System.out.println("Rapport créé avec success... ");
//
//
//
//        } catch (Exception e){
//            System.out.println("Mon exception "+ e);
//        }
//    }
//
//    public static JasperReport getSubReport(){
//
//        String filePath = "F:\\project tests\\jsaperTest\\src\\main\\resources\\First_Report.jrxml";
//        JasperReport report;
//
//        try {
//            report = JasperCompileManager.compileReport(filePath);
//            return report;
//
//        } catch (JRException e){
//            e.printStackTrace();
//        }
//
//        return null;
//    }
//
//    public static JRBeanCollectionDataSource getSuDataSource(){
//
//        Student student1 = new Student(1L, "Arel", "Meilleur", "Yaounde Cameroun",
//                    "Yaou");
//
//            Student student2 = new Student(2L, "Best", "dibeti", "Douala Cameroun",
//                    "Yaou");
//
//            List<Student> list = new ArrayList<Student>();
//            list.add(student1);
//            list.add(student2);
//
//            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
//
//            return dataSource;
//
//
//    }
//
//    public static Map<String, Object> getSubParameters(){
//        Map<String, Object> parameters = new HashMap<String, Object>();
//        parameters.put("studentName", "Best");
//
//        return parameters;
//    }

    }}
