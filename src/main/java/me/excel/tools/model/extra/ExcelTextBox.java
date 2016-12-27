package me.excel.tools.model.extra;

import java.io.Serializable;

/**
 * excel text box, this is a warp of poi text box and simplify api, because this text box just propose to show same error message on excel.
 * <p>
 * Created by hanwen on 2016/12/27.
 */
public interface ExcelTextBox extends Serializable {

  /**
   * @return message on text box
   */
  String getMessage();

  /**
   * @return sheet index of text box at
   */
  int getSheetIndex();

  /**
   * @return style
   * @see TextBoxStyle
   */
  TextBoxStyle getStyle();
}
