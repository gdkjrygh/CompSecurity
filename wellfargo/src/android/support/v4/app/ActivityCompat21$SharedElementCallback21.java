// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

public abstract class 
{

    public abstract Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectf);

    public abstract View onCreateSnapshotView(Context context, Parcelable parcelable);

    public abstract void onMapSharedElements(List list, Map map);

    public abstract void onRejectSharedElements(List list);

    public abstract void onSharedElementEnd(List list, List list1, List list2);

    public abstract void onSharedElementStart(List list, List list1, List list2);

    public ()
    {
    }
}
