package me.excel.tools;

/**
 * Created by hanwen on 16-1-18.
 */
public class ExcelConstants {

  private ExcelConstants() {
    // default constructor
  }

  /**
   * <pre>
   * the business key present a domain object, it can identified a domain object.
   * it useful where update a domain object using excel template.
   * </pre>
   */
  public static final String BUSINESS_KEY_PREFIX = "businessKey.";

  public static final String DOT_SEPARATOR = ".";

  public static final String COMMA_SEPARATOR = ",";

  public static final String SEMICOLON_SEPARATOR = ":";

  public static final String EMPTY_VALUE = "";

  public static final String SUFFIX_XLS = ".xls";

  public static final String SUFFIX_XLSX = ".xlsx";

}
