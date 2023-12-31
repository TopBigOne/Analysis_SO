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
jarsigner -verbose -keystore watson.keystore -signedjar only_signed.apk new_1111111111111111111.apk watson.keystore
```

* step 5: 内存对齐

```shell
zipalign -p -f -v 4 only_signed.apk only_signed_with_aligin.apk 
```

* step 5: install 

```shell
adb  install only_signed_with_aligin.apk 
```



----------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------------
----------------------------------------------------------------------------------------------------------------------------------------------------------------

### 启动Activity

* 启动界面

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

* 看看顶部的Activity

```shell
adb shell dumpsys activity top
```
* clear data.

```shell
adb shell pm clear pro.hogiouxm.adcr
```