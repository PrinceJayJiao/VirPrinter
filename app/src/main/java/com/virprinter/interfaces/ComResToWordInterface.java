package com.virprinter.interfaces;

import com.virprinter.models.ComparisonResult;

public interface ComResToWordInterface {

    //保存比对结果文件类的需要实现这个接口
    void saveCompareResToFile(ComparisonResult comparisonResult,String path);
}
