* step 1

```shell
$ apktool d -f -o ./result/ ./Fortune_Slots_Tiger_CandyBlast_1.22_apkcombo.com.apk

```

* step 2 重新打包

```shell
apktool b ./result -o ./new_1111111111111111111.apk
````

* step 3 :创建签名文件

```shell
keytool -genkey -alias watson.keystore -keyalg RSA -validity 40000 -keystore watson.keystore
```

* step 4: 给 apk 签名

```shell
jarsigner -verbose -keystore watson.keystore -signedjar signed.apk new_1111111111111111111.apk watson.keystore
```

* step 5: 内存对齐

```shell
zipalign -p -f -v 4 signed.apk two_entry_align_signed.apk 
```

----------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------------

### 启动Activity

* 主界面

```shell
adb shell am start -n pro.hogiouxm.adcr/.nh0bh6q.UdpkxUfoActivity
```

* 游戏界面
```shell
adb shell am start -n pro.hogiouxm.adcr/.cg0mhzg.WzqbAtsActivity
```

* 本地能看到的布局界面

```shell
adb shell am start -n pro.hogiouxm.adcr/.qyt3l53aa9h6w0l0d.FkLxzActivity
```
