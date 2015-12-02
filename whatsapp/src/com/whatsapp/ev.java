// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.view.MotionEvent;
import android.view.View;

public abstract class ev extends CharacterStyle
    implements UpdateAppearance
{

    public ev()
    {
    }

    public abstract boolean a(View view, MotionEvent motionevent);

    public abstract void updateDrawState(TextPaint textpaint);
}
