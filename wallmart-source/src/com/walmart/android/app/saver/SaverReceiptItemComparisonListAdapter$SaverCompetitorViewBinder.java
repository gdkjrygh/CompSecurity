// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.walmart.android.app.saver:
//            SaverReceiptItemComparisonListAdapter

private class <init>
    implements android.support.v4.widget.der
{

    final SaverReceiptItemComparisonListAdapter this$0;

    public boolean setViewValue(View view, Cursor cursor, int i)
    {
        if (SaverReceiptItemComparisonListAdapter.access$100(SaverReceiptItemComparisonListAdapter.this) != i) goto _L2; else goto _L1
_L1:
        i = cursor.getInt(i);
        if (view.getId() != 0x7f1004d2) goto _L4; else goto _L3
_L3:
        ((TextView)view).setText(SaverReceiptItemComparisonListAdapter.access$300(SaverReceiptItemComparisonListAdapter.this).getResources().getString(0x7f0900fc, new Object[] {
            Float.valueOf((float)SaverReceiptItemComparisonListAdapter.access$200(SaverReceiptItemComparisonListAdapter.this, i) * 0.01F)
        }));
_L5:
        return true;
_L4:
        if (view.getId() == 0x7f1004d3)
        {
            i = SaverReceiptItemComparisonListAdapter.access$400(SaverReceiptItemComparisonListAdapter.this) - SaverReceiptItemComparisonListAdapter.access$200(SaverReceiptItemComparisonListAdapter.this, i);
            if (i < 0)
            {
                ((TextView)view).setText(SaverReceiptItemComparisonListAdapter.access$500(SaverReceiptItemComparisonListAdapter.this).getResources().getString(0x7f0900fc, new Object[] {
                    Float.valueOf((float)(-i) * 0.01F)
                }));
                view.setVisibility(0);
                ((TextView)view).setTextColor(SaverReceiptItemComparisonListAdapter.access$600(SaverReceiptItemComparisonListAdapter.this).getResources().getColor(0x7f0f00db));
            } else
            if (i > 0 && cursor.getPosition() == 0)
            {
                ((TextView)view).setText(SaverReceiptItemComparisonListAdapter.access$700(SaverReceiptItemComparisonListAdapter.this).getResources().getString(0x7f0900fc, new Object[] {
                    Float.valueOf((float)i * 0.01F)
                }));
                ((TextView)view).setTextColor(SaverReceiptItemComparisonListAdapter.access$800(SaverReceiptItemComparisonListAdapter.this).getResources().getColor(0x7f0f00e3));
                view.setVisibility(0);
            } else
            {
                view.setVisibility(4);
            }
        } else
        if (view.getId() == 0x7f1004d4)
        {
            i = SaverReceiptItemComparisonListAdapter.access$400(SaverReceiptItemComparisonListAdapter.this) - SaverReceiptItemComparisonListAdapter.access$200(SaverReceiptItemComparisonListAdapter.this, i);
            if (i > 0 && cursor.getPosition() == 0)
            {
                ((TextView)view).setText(SaverReceiptItemComparisonListAdapter.access$900(SaverReceiptItemComparisonListAdapter.this).getResources().getString(0x7f090496));
                ((TextView)view).setTextColor(SaverReceiptItemComparisonListAdapter.access$1000(SaverReceiptItemComparisonListAdapter.this).getResources().getColor(0x7f0f00e3));
                view.setVisibility(0);
            } else
            if (i < 0)
            {
                ((TextView)view).setText(SaverReceiptItemComparisonListAdapter.access$1100(SaverReceiptItemComparisonListAdapter.this).getResources().getString(0x7f090497));
                ((TextView)view).setTextColor(SaverReceiptItemComparisonListAdapter.access$1200(SaverReceiptItemComparisonListAdapter.this).getResources().getColor(0x7f0f00db));
                view.setVisibility(0);
            } else
            {
                view.setVisibility(4);
            }
        } else
        if (view.getId() == 0x7f1000fe)
        {
            if ("lb".equalsIgnoreCase(SaverReceiptItemComparisonListAdapter.access$1300(SaverReceiptItemComparisonListAdapter.this)))
            {
                ((TextView)view).setText(SaverReceiptItemComparisonListAdapter.access$1500(SaverReceiptItemComparisonListAdapter.this).getResources().getString(0x7f0900fb, new Object[] {
                    Float.valueOf(SaverReceiptItemComparisonListAdapter.access$1400(SaverReceiptItemComparisonListAdapter.this)), Integer.valueOf(1), Float.valueOf((float)i * 0.01F)
                }));
                view.setVisibility(0);
            } else
            if (SaverReceiptItemComparisonListAdapter.access$1400(SaverReceiptItemComparisonListAdapter.this) > 1.0F)
            {
                ((TextView)view).setText(SaverReceiptItemComparisonListAdapter.access$1600(SaverReceiptItemComparisonListAdapter.this).getResources().getString(0x7f0900fd, new Object[] {
                    Integer.valueOf((int)SaverReceiptItemComparisonListAdapter.access$1400(SaverReceiptItemComparisonListAdapter.this)), Float.valueOf((float)i * 0.01F)
                }));
                view.setVisibility(0);
            } else
            {
                view.setVisibility(8);
            }
        }
        if (true) goto _L5; else goto _L2
_L2:
        if (SaverReceiptItemComparisonListAdapter.access$1700(SaverReceiptItemComparisonListAdapter.this) == i)
        {
            cursor = cursor.getString(i);
            ((TextView)view).setText((new StringBuilder()).append("@ ").append(cursor).toString());
            return true;
        } else
        {
            return false;
        }
    }

    private ()
    {
        this$0 = SaverReceiptItemComparisonListAdapter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
