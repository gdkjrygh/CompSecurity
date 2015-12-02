// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeProviderCompat, AccessibilityNodeInfoCompat

class val.compat
    implements val.compat
{

    final val.compat this$0;
    final AccessibilityNodeProviderCompat val$compat;

    public Object createAccessibilityNodeInfo(int i)
    {
        AccessibilityNodeInfoCompat accessibilitynodeinfocompat = val$compat.createAccessibilityNodeInfo(i);
        if (accessibilitynodeinfocompat == null)
        {
            return null;
        } else
        {
            return accessibilitynodeinfocompat.getInfo();
        }
    }

    public List findAccessibilityNodeInfosByText(String s, int i)
    {
        boolean flag = AccessibilityNodeInfoCompat.a;
        s = val$compat.findAccessibilityNodeInfosByText(s, i);
        ArrayList arraylist = new ArrayList();
        int j = s.size();
        i = 0;
        do
        {
label0:
            {
                if (i < j)
                {
                    arraylist.add(((AccessibilityNodeInfoCompat)s.get(i)).getInfo());
                    if (!flag)
                    {
                        break label0;
                    }
                }
                if (Fragment.a != 0)
                {
                    if (flag)
                    {
                        flag = false;
                    } else
                    {
                        flag = true;
                    }
                    AccessibilityNodeInfoCompat.a = flag;
                }
                return arraylist;
            }
            i++;
        } while (true);
    }

    public boolean performAction(int i, int j, Bundle bundle)
    {
        return val$compat.performAction(i, j, bundle);
    }

    ()
    {
        this$0 = final_;
        val$compat = AccessibilityNodeProviderCompat.this;
        super();
    }
}
