package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {
    private Paint mPaintRound,mPaintSquare;
    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaintRound = new Paint();
        mPaintRound.setColor(Color.BLACK);
        mPaintRound.setStrokeWidth(20);
        mPaintRound.setStrokeCap(Paint.Cap.ROUND);

        mPaintSquare = new Paint();
        mPaintSquare.setStrokeWidth(50);
        mPaintSquare.setColor(Color.BLACK);
        mPaintSquare.setStrokeCap(Paint.Cap.SQUARE);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        canvas.drawPoint(350,450,mPaintRound);
        canvas.drawPoint(750,450,mPaintSquare);
    }
}
