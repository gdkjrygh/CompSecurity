// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.util.Log;
import com.mixpanel.android.mpmetrics.MPConfig;

class FlipGesture
    implements SensorEventListener
{
    public static interface OnFlipGestureListener
    {

        public abstract void onFlipGesture();
    }


    private static final float ACCELEROMETER_SMOOTHING = 0.7F;
    private static final int FLIP_STATE_DOWN = 1;
    private static final int FLIP_STATE_NONE = 0;
    private static final int FLIP_STATE_UP = -1;
    private static final String LOGTAG = "MixpanelAPI.FlipGesture";
    private static final float MAXIMUM_GRAVITY_FOR_FLIP = 11.8F;
    private static final long MINIMUM_CANCEL_DURATION = 0x3b9aca00L;
    private static final float MINIMUM_GRAVITY_FOR_FLIP = 7.8F;
    private static final long MINIMUM_UP_DOWN_DURATION = 0xee6b280L;
    private static final int TRIGGER_STATE_BEGIN = 1;
    private static final int TRIGGER_STATE_NONE = 0;
    private int mFlipState;
    private long mLastFlipTime;
    private final OnFlipGestureListener mListener;
    private final float mSmoothed[] = new float[3];
    private int mTriggerState;

    public FlipGesture(OnFlipGestureListener onflipgesturelistener)
    {
        mTriggerState = -1;
        mFlipState = 0;
        mLastFlipTime = -1L;
        mListener = onflipgesturelistener;
    }

    private float[] smoothXYZ(float af[])
    {
        int i = 0;
        do
        {
            if (i >= 3)
            {
                return mSmoothed;
            }
            float f = mSmoothed[i];
            mSmoothed[i] = 0.7F * (af[i] - f) + f;
            i++;
        } while (true);
    }

    public void onAccuracyChanged(Sensor sensor, int i)
    {
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        long l;
        float af[] = smoothXYZ(sensorevent.values);
        int i = mFlipState;
        float f = af[0] * af[0] + af[1] * af[1] + af[2] * af[2];
        mFlipState = 0;
        if (af[2] > 7.8F && af[2] < 11.8F)
        {
            mFlipState = -1;
        }
        if (af[2] < -7.8F && af[2] > -11.8F)
        {
            mFlipState = 1;
        }
        if (f < 60.84F || f > 139.24F)
        {
            mFlipState = 0;
        }
        if (i != mFlipState)
        {
            mLastFlipTime = sensorevent.timestamp;
        }
        l = sensorevent.timestamp - mLastFlipTime;
        mFlipState;
        JVM INSTR tableswitch -1 1: default 168
    //                   -1 205
    //                   0 251
    //                   1 169;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L4:
        if (l > 0xee6b280L && mTriggerState == 0)
        {
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.FlipGesture", "Flip gesture begun");
            }
            mTriggerState = 1;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (l > 0xee6b280L && mTriggerState == 1)
        {
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.FlipGesture", "Flip gesture completed");
            }
            mTriggerState = 0;
            mListener.onFlipGesture();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (l > 0x3b9aca00L && mTriggerState != 0)
        {
            if (MPConfig.DEBUG)
            {
                Log.v("MixpanelAPI.FlipGesture", "Flip gesture abandoned");
            }
            mTriggerState = 0;
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }
}
