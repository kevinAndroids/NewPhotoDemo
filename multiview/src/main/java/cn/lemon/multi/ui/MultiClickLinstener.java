package cn.lemon.multi.ui;

import java.util.List;

public interface MultiClickLinstener {
  public void longClick(String position,List<String> mData);
  public void onOneClick(String position,List<String> mData);
}