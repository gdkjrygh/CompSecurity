// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;


// Referenced classes of package android.support.v4.view.accessibility:
//            AccessibilityNodeProviderCompatKitKat, AccessibilityNodeProviderCompat

class _cls1 extends _cls1
{

    public Object newAccessibilityNodeProviderBridge(final AccessibilityNodeProviderCompat compat)
    {
        class _cls1
            implements AccessibilityNodeProviderCompatKitKat.AccessibilityNodeInfoBridge
        {

            final AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl this$0;
            final AccessibilityNodeProviderCompat val$compat;

            public Object createAccessibilityNodeInfo(int i)
            {
                AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.createAccessibilityNodeInfo(i);
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
                s = compat.findAccessibilityNodeInfosByText(s, i);
                ArrayList arraylist = new ArrayList();
                int j = s.size();
                for (i = 0; i < j; i++)
                {
                    arraylist.add(((AccessibilityNodeInfoCompat)s.get(i)).getInfo());
                }

                return arraylist;
            }

            public Object findFocus(int i)
            {
                AccessibilityNodeInfoCompat accessibilitynodeinfocompat = compat.findFocus(i);
                if (accessibilitynodeinfocompat == null)
                {
                    return null;
                } else
                {
                    return accessibilitynodeinfocompat.getInfo();
                }
            }

            public boolean performAction(int i, int j, Bundle bundle)
            {
                return compat.performAction(i, j, bundle);
            }

            _cls1()
            {
                this$0 = AccessibilityNodeProviderCompat.AccessibilityNodeProviderKitKatImpl.this;
                compat = accessibilitynodeprovidercompat;
                super();
            }
        }

        return AccessibilityNodeProviderCompatKitKat.newAccessibilityNodeProviderBridge(new _cls1());
    }

    _cls1()
    {
    }
}
