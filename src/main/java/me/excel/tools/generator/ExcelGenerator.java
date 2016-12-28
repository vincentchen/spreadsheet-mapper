package me.excel.tools.generator;

import me.excel.tools.extractor.FieldValueExtractor;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * file generator, generated all cell type is string (include number, date ...).
 * <p>
 * Created by hanwen on 15-12-16.
 */
public interface ExcelGenerator {

  /**
   * @param sheetContexts sheet contexts
   * @see SheetContext
   */
  void addSheetContext(SheetContext... sheetContexts);

  /**
   * field value extractor unique with object field in one sheet (one to one), after add will override before add
   *
   * @param fieldValueExtractors field value extractor
   * @see FieldValueExtractor
   */
  void addValueExtractors(FieldValueExtractor... fieldValueExtractors);

  /**
   * @param file intend write file
   * @throws IOException io exception
   * @see #write(File)
   */
  void write(File file) throws IOException;

  /**
   * write file to supplied output stream
   *
   * @param outputStream intend write stream, notice close
   * @throws IOException io exception
   */
  void write(OutputStream outputStream) throws IOException;
}
