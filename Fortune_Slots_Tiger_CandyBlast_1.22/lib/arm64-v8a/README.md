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

* 显示动态符号
```shell
nm -D libadcr.so
```

* 列出 libadcr.so 的函数
```shell
objdump -tT libadcr.so
```


