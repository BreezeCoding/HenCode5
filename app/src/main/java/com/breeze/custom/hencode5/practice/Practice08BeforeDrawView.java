package com.breeze.custom.hencode5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;

public class Practice08BeforeDrawView extends AppCompatEditText {

    public Practice08BeforeDrawView(Context context) {
        super(context);
    }

    public Practice08BeforeDrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice08BeforeDrawView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void draw(Canvas canvas) {
        //  在 super.draw() 的上方插入绘制代码，让绘制内容被其他所有内容盖住
        canvas.drawColor(Color.parseColor("#66BB6A")); // 涂上绿色

        super.draw(canvas);
    }
}
