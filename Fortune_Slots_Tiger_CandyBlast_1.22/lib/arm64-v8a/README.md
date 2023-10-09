* 显示目标文件的完整内容，包括所有节的内容
```shell
llvm-objdump -s libadcr.so
```


* 显示目标文件的符号表
```shell
llvm-objdump -t libadcr.so
```

* 显示动态的符号表
```shell
llvm-objdump -T libadcr.so
```