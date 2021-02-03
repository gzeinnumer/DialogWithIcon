package com.gzeinnumer.dialogwithicon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.gzeinnumer.mylibdialogfragment.MyLibDialog;

public class DialogIcon extends MyLibDialog {

    public DialogIcon() {
        super(R.style.CustomDialogStyle);
    }

    public static DialogIcon newInstance() {
        return new DialogIcon();
    }

    @Override
    public void onStart() {
        super.onStart();

        // disable cancel
        getDialog().setCancelable(false);

        // disable dismiss dialog out side
        getDialog().setCanceledOnTouchOutside(false);

        // set dialog full screen
//        setFullScreen(true);

        // set canvas width, avaliable value 0.1 - 1.0
//        setCanvasWidth(0.3);

        // set BackButton to dismiss dialog
        enableBackButton(false);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);
    }

    private void initView(View view) {
        LinearLayout _dialogCanvas = view.findViewById(R.id.dialog_canvas);

//        _dialogCanvas.setBackground(requireActivity().getResources().getDrawable(R.drawable.rounded_corner));

        _dialogCanvas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDialog().dismiss();
            }
        });
    }
}
