<p align="center">
  <img src="https://github.com/gzeinnumer/DialogWithIcon/blob/master/preview/example1.jpg"/>
</p>

- gradle
```gradle
maven { url 'https://jitpack.io' }

implementation 'com.github.gzeinnumer:MyLibDialogFragment:1.0.1'
implementation 'com.github.gzeinnumer:MyLibStyle:0.1.5'
```

ReadMore for [MyLibDialogFragment](https://github.com/gzeinnumer/MyLibDialogFragment)

- `DialogIcon.java`
```java
public class DialogIcon extends MyLibDialog {

    ...

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog, container, false);
    }

    ...
}
```

- `dialog.xml`
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/dialog_canvas"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:background="@android:color/transparent"
    android:orientation="vertical"
    tools:background="@android:color/black">

    <ImageView
        android:layout_width="80dp"
        android:layout_height="wrap_content"
        android:layout_gravity="end"
        android:layout_marginBottom="-32dp"
        android:adjustViewBounds="true"
        android:background="@drawable/rounded_corner_3d"
        android:padding="4dp"
        android:scaleType="fitStart"
        android:src="@mipmap/ic_launcher"
        android:translationZ="1dp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginEnd="@dimen/def_margin"
        android:background="@drawable/rounded_layer"
        android:gravity="center"
        android:orientation="vertical"
        android:padding="@dimen/def_margin">

        <TextView
            style="@style/MyTextHeader"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="0dp"
            android:text="Sample Title Dialog" />

        <TextView
            style="@style/MyTextContent"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="@dimen/def_margin"
            android:text="Dialog Dengan Icon" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="@dimen/def_margin"
            android:gravity="center">

            <Button
                style="@style/MyButtonContained"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="OK" />

            <Button
                style="@style/MyButtonContained"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginStart="@dimen/def_margin"
                android:text="Cancel" />
        </LinearLayout>
    </LinearLayout>
</LinearLayout>
```

---

- app
  - [DialogIcon.java](https://github.com/gzeinnumer/DialogWithIcon/blob/master/app/src/main/java/com/gzeinnumer/dialogwithicon/DialogIcon.java)
  - [MainActivity.java](https://github.com/gzeinnumer/DialogWithIcon/blob/master/app/src/main/java/com/gzeinnumer/dialogwithicon/MainActivity.java)
- res
  - drawable
    - [rounded_corner_3d.xml](https://github.com/gzeinnumer/DialogWithIcon/blob/master/app/src/main/res/drawable/rounded_corner_3d.xml)
    - [rounded_layer.xml](https://github.com/gzeinnumer/DialogWithIcon/blob/master/app/src/main/res/drawable/rounded_layer.xml)
  - layout
    - [dialog.xml](https://github.com/gzeinnumer/DialogWithIcon/blob/master/app/src/main/res/layout/dialog.xml)
  - value
    - [themes.xml](https://github.com/gzeinnumer/DialogWithIcon/blob/master/app/src/main/res/values/themes.xml)

---

```
Copyright 2021 M. Fadli Zein
```