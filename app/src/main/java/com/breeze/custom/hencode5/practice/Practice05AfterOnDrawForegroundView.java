package com.breeze.custom.hencode5.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class Practice05AfterOnDrawForegroundView extends AppCompatImageView {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice05AfterOnDrawForegroundView(Context context) {
        super(context);
    }

    public Practice05AfterOnDrawForegroundView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice05AfterOnDrawForegroundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
    }


    // onDrawForeground()方法   会依次绘制滑动边缘渐变、滑动条和前景。    在API23才被引入

    @Override
    public void onDrawForeground(Canvas canvas) {

        // 如果你把绘制代码写在了 super.onDrawForeground() 的上面
        // 绘制内容就会在 dispatchDraw() 和 super.onDrawForeground() 之间执行
        // 那么绘制内容会盖住子 View，但被滑动边缘渐变、滑动条以及前景盖住：

        super.onDrawForeground(canvas);

        // 在 super.onDrawForeground() 的下方插入绘制代码，让绘制内容盖住前景

        // 如果你把绘制代码写在了 super.onDrawForeground() 的下面
        // 绘制代码会在滑动边缘渐变、滑动条和前景之后被执行
        // 那么绘制内容将会盖住滑动边缘渐变、滑动条和前景。
        paint.setColor(Color.parseColor("#f44336"));
        canvas.drawRect(0, 40, 200, 120, paint);
        paint.setColor(Color.WHITE);
        canvas.drawText("New", 20, 100, paint);
    }
}
