// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.android.abc.image_classification;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Vector;

public class ImageClassifier
{

    private long m_ImageClassifierPtr;
    private boolean m_owner;

    public ImageClassifier()
    {
        m_ImageClassifierPtr = nativeCreate();
        m_owner = true;
    }

    public ImageClassifier(long l)
    {
        m_ImageClassifierPtr = l;
        m_owner = false;
    }

    public static String getVersion()
    {
        return nativeGetVersion();
    }

    private native void nativeClassify(int i, int j, int k, int l, long l1, int i1);

    private native void nativeClassify(Bitmap bitmap, int i);

    private native void nativeClassify(String s, int i);

    private native void nativeConfigure(String s);

    private native long nativeCreate();

    private native void nativeDispose();

    private native Vector nativeGetClassificationResults();

    private static native String nativeGetVersion();

    private native void nativeLoadModel(String s);

    private static native boolean nativeStaticInitializer();

    public void classify(int i, int j, int k, int l, long l1, int i1)
    {
        nativeClassify(i, j, k, l, l1, i1);
    }

    public void classify(Bitmap bitmap, int i)
    {
        nativeClassify(bitmap, i);
    }

    public void classify(String s, int i)
    {
        Bitmap bitmap = BitmapFactory.decodeFile(s);
        if (bitmap != null)
        {
            classify(bitmap, i);
            return;
        } else
        {
            nativeClassify(s, i);
            return;
        }
    }

    public void dispose()
    {
        if (m_owner)
        {
            nativeDispose();
        }
        m_ImageClassifierPtr = 0L;
        m_owner = false;
    }

    protected void finalize()
    {
        dispose();
    }

    public Vector getClassificationResults()
    {
        return nativeGetClassificationResults();
    }

    public long getPtr()
    {
        return m_ImageClassifierPtr;
    }

    public void loadConfigurationFile(String s)
    {
        nativeConfigure(s);
    }

    public void loadModel(String s)
    {
        nativeLoadModel(s);
    }

    static 
    {
        if (!nativeStaticInitializer())
        {
            throw new RuntimeException("com.kofax.android.abc.image_classification: Static initializer failed.");
        } else
        {
            System.loadLibrary("sol_isg_mobile");
        }
    }
}
