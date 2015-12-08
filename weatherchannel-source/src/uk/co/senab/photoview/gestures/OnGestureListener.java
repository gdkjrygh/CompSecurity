// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview.gestures;


public interface OnGestureListener
{

    public abstract void onDrag(float f, float f1);

    public abstract void onFling(float f, float f1, float f2, float f3);

    public abstract void onScale(float f, float f1, float f2);
}
