// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import android.hardware.Sensor;
import android.hardware.SensorEvent;

// Referenced classes of package com.kofax.kmc.kui.uicontrols:
//            LevelnessListener, StabilityDelayListener

public interface ILevelManager
{

    public abstract void addLevelnessListener(LevelnessListener levelnesslistener);

    public abstract void addStabilityDelayListener(StabilityDelayListener stabilitydelaylistener);

    public abstract int getColor(boolean flag);

    public abstract float getCurrentPitch();

    public abstract float getCurrentRoll();

    public abstract int getIndicatorColorFocusing();

    public abstract int getIndicatorColorGood();

    public abstract int getIndicatorColorNotLevel();

    public abstract int getIndicatorColorNotStable();

    public abstract float getOffsetX();

    public abstract float getOffsetY();

    public abstract float getReferencePitch();

    public abstract float getReferenceRoll();

    public abstract int getStabilityDelay();

    public abstract float getThresholdPitch();

    public abstract float getThresholdRoll();

    public abstract boolean isLevel();

    public abstract boolean isStable();

    public abstract void onAccuracyChanged(Sensor sensor, int i);

    public abstract void onSensorChanged(SensorEvent sensorevent);

    public abstract void removeLevelnessListener(LevelnessListener levelnesslistener);

    public abstract void removeStabilityDelayListener(StabilityDelayListener stabilitydelaylistener);

    public abstract void setIndicatorColorFocusing(int i);

    public abstract void setIndicatorColorGood(int i);

    public abstract void setIndicatorColorNotLevel(int i);

    public abstract void setIndicatorColorNotStable(int i);

    public abstract void setReferencePitch(float f);

    public abstract void setReferenceRoll(float f);

    public abstract void setStabilityDelay(int i);

    public abstract void setThresholdPitch(float f);

    public abstract void setThresholdRoll(float f);

    public abstract void start();

    public abstract void stop();

    public abstract void updateMotionSesnor();
}
