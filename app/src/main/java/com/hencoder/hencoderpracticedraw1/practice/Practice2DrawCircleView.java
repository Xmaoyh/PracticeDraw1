package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    private Paint mPaintSolid = new Paint();
    private Paint mPaintStroke = new Paint();
    private Paint mPaintBlue = new Paint();
    private Paint mPaint2 = new Paint();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaintSolid.setColor(Color.BLACK);
        mPaintSolid.setStyle(Paint.Style.FILL);

        mPaintStroke.setColor(Color.BLACK);
        mPaintStroke.setStyle(Paint.Style.STROKE);

        mPaintBlue.setColor(Color.BLUE);
        mPaintBlue.setStyle(Paint.Style.FILL);

        mPaint2.setColor(Color.BLACK);
        mPaint2.setStyle(Paint.Style.STROKE);
        mPaint2.setStrokeWidth(20);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        canvas.drawCircle(200, 200, 150, mPaintSolid);
        canvas.drawCircle(600, 200, 150, mPaintStroke);
        canvas.drawCircle(200, 600, 150, mPaintBlue);
        canvas.drawCircle(600, 600, 150, mPaint2);
    }
}
