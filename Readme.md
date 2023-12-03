# 开发者必读

1. 项目采用gradle作为管理工具，安卓默认是这样，最好不改了    
2. 每个人git clone该项目到自己的主机上，新建分支进行开发，测试完毕后Merge到主分支上，最后再pull   
3. 每个人新建一个pacakge,位于java/com.virprinter下 比如com.virprinter.march(这个我已经建好了，大伙参考一下)  进行开发, test下相同位置建相同包进行测试。
4. 请注意阅读项目com.virprinter.interfaces下的接口，写的工具类要实现这些接口。(参考我写的示例com.virprinter.march.PdfParser)   
5. 
