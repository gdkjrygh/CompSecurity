// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

public class SwipeDetectingFrameLayout extends FrameLayout
{
    public static interface SwipeDetector
    {

        public abstract boolean onSwipeDetected(SwipeDirection swipedirection);
    }

    public static final class SwipeDirection extends Enum
    {

        private static final SwipeDirection $VALUES[];
        public static final SwipeDirection Left;
        public static final SwipeDirection Right;

        public static SwipeDirection valueOf(String s)
        {
            return (SwipeDirection)Enum.valueOf(com/contextlogic/wish/ui/components/layout/SwipeDetectingFrameLayout$SwipeDirection, s);
        }

        public static SwipeDirection[] values()
        {
            return (SwipeDirection[])$VALUES.clone();
        }

        static 
        {
            Left = new SwipeDirection("Left", 0);
            Right = new SwipeDirection("Right", 1);
            $VALUES = (new SwipeDirection[] {
                Left, Right
            });
        }

        private SwipeDirection(String s, int i)
        {
            super(s, i);
        }
    }


    private GestureDetector gestureDetector;
    private SwipeDetector swipeDetector;
    private int swipeMaxOffPath;
    private int swipeMinDistance;
    private int swipeThresholdVelocity;

    public SwipeDetectingFrameLayout(Context context)
    {
        super(context);
        init();
    }

    public SwipeDetectingFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public SwipeDetectingFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private boolean handleSwipe(SwipeDirection swipedirection)
    {
        if (swipeDetector != null)
        {
            return swipeDetector.onSwipeDetected(swipedirection);
        } else
        {
            return false;
        }
    }

    private void init()
    {
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        if (viewconfiguration == null)
        {
            return;
        } else
        {
            swipeMinDistance = viewconfiguration.getScaledPagingTouchSlop();
            swipeMaxOffPath = swipeMinDistance * 3;
            swipeThresholdVelocity = viewconfiguration.getScaledMinimumFlingVelocity();
            gestureDetector = new GestureDetector(getContext(), new android.view.GestureDetector.SimpleOnGestureListener() {

                final SwipeDetectingFrameLayout this$0;

                public boolean onDown(MotionEvent motionevent)
                {
                    return false;
                }

                public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
                {
                    if (Math.abs(motionevent.getY() - motionevent1.getY()) <= (float)swipeMaxOffPath)
                    {
                        if (motionevent.getX() - motionevent1.getX() > (float)swipeMinDistance && Math.abs(f) > (float)swipeThresholdVelocity)
                        {
                            return handleSwipe(SwipeDirection.Left);
                        }
                        if (motionevent1.getX() - motionevent.getX() > (float)swipeMinDistance && Math.abs(f) > (float)swipeThresholdVelocity)
                        {
                            return handleSwipe(SwipeDirection.Right);
                        }
                    }
                    return false;
                }

            
            {
                this$0 = SwipeDetectingFrameLayout.this;
                super();
            }
            });
            return;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (swipeDetector == null)
        {
            return super.onInterceptTouchEvent(motionevent);
        }
        if (gestureDetector != null)
        {
            super.onInterceptTouchEvent(motionevent);
            return gestureDetector.onTouchEvent(motionevent);
        } else
        {
            return super.onInterceptTouchEvent(motionevent);
        }
    }

    public void setSwipeDetector(SwipeDetector swipedetector)
    {
        swipeDetector = swipedetector;
    }




}
