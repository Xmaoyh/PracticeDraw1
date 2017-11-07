package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private Paint mPaint1,mPaint2;
    private RectF mRect;
    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint2.setStyle(Paint.Style.STROKE);
        mRect  = new RectF(200,100,800,500);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        canvas.drawArc(mRect,-110,100,true,mPaint1);
        canvas.drawArc(mRect,20,140,false,mPaint1);
        canvas.drawArc(mRect,180,60,false,mPaint2);
    }
}
