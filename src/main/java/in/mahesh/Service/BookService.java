package in.mahesh.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import in.mahesh.entity.Books;
import in.mahesh.repo.BooksRepo;

@Service
public class BookService {
	private BooksRepo bookRepo;

	public BookService(BooksRepo bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}
	
	
	public void generatExcel() throws Exception {
		List<Books> listBooks = bookRepo.findAll();
		HSSFWorkbook workBook =new HSSFWorkbook();
		HSSFSheet sheet = workBook.createSheet("BOOKS_DETAILS");
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("BookId");
		row.createCell(1).setCellValue("BOOK_NAME");
		row.createCell(2).setCellValue("AUTHOR");
		row.createCell(3).setCellValue("PUBLISHED_DATE");
		int rowIndex=1;
		
		
		for(Books ls : listBooks ) {
			HSSFRow row2 = sheet.createRow(rowIndex);
			row2.createCell(0).setCellValue(ls.getbId());
			row2.createCell(1).setCellValue(ls.getbName());
			row2.createCell(2).setCellValue(ls.getbAuthor());
			row2.createCell(3).setCellValue(ls.getPublishedate().toString());
			rowIndex++;
		}
		
		FileOutputStream fs=new FileOutputStream("mahesh.xls");
		workBook.write(fs);
		workBook.close();
		fs.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void bookSave() {
		Books b1=new Books("JAVA","Rajesh",LocalDate.of(2000, 1, 1));
		Books b2=new Books("HTML","Rajesh",LocalDate.of(2000, 1, 4));
		Books b3=new Books("CSS","Rajesh",LocalDate.of(2000, 1, 3));
		Books b4=new Books("JS","Rajesh",LocalDate.of(2000, 1, 2));
		
		bookRepo.saveAll(Arrays.asList(b1,b2,b3,b4));
		System.out.println("Sucessfully........");
	}

}
