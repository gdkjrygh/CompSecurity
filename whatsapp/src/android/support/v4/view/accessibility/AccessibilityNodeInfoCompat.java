// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.support.v4.app.Fragment;
import android.view.View;

public class AccessibilityNodeInfoCompat
{

    private static final AccessibilityNodeInfoImpl IMPL;
    public static boolean a;
    private static final String z[];
    private final Object mInfo;

    public AccessibilityNodeInfoCompat(Object obj)
    {
        mInfo = obj;
    }

    private static String getActionSymbolicName(int i)
    {
        switch (i)
        {
        default:
            return z[8];

        case 1: // '\001'
            return z[7];

        case 2: // '\002'
            return z[12];

        case 4: // '\004'
            return z[18];

        case 8: // '\b'
            return z[11];

        case 16: // '\020'
            return z[17];

        case 32: // ' '
            return z[3];

        case 64: // '@'
            return z[1];

        case 128: 
            return z[15];

        case 256: 
            return z[2];

        case 512: 
            return z[4];

        case 1024: 
            return z[16];

        case 2048: 
            return z[14];

        case 4096: 
            return z[0];

        case 8192: 
            return z[5];

        case 65536: 
            return z[13];

        case 16384: 
            return z[6];

        case 32768: 
            return z[9];

        case 131072: 
            return z[10];
        }
    }

    public static AccessibilityNodeInfoCompat obtain(AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        return wrapNonNullInstance(IMPL.obtain(accessibilitynodeinfocompat.mInfo));
    }

    static AccessibilityNodeInfoCompat wrapNonNullInstance(Object obj)
    {
        if (obj != null)
        {
            return new AccessibilityNodeInfoCompat(obj);
        } else
        {
            return null;
        }
    }

    public void addAction(int i)
    {
        IMPL.addAction(mInfo, i);
    }

    public void addChild(View view)
    {
        IMPL.addChild(mInfo, view);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (AccessibilityNodeInfoCompat)obj;
        if (mInfo != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((AccessibilityNodeInfoCompat) (obj)).mInfo == null) goto _L1; else goto _L3
_L3:
        return false;
        if (mInfo.equals(((AccessibilityNodeInfoCompat) (obj)).mInfo)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int getActions()
    {
        return IMPL.getActions(mInfo);
    }

    public void getBoundsInParent(Rect rect)
    {
        IMPL.getBoundsInParent(mInfo, rect);
    }

    public void getBoundsInScreen(Rect rect)
    {
        IMPL.getBoundsInScreen(mInfo, rect);
    }

    public CharSequence getClassName()
    {
        return IMPL.getClassName(mInfo);
    }

    public CharSequence getContentDescription()
    {
        return IMPL.getContentDescription(mInfo);
    }

    public Object getInfo()
    {
        return mInfo;
    }

    public int getMovementGranularities()
    {
        return IMPL.getMovementGranularities(mInfo);
    }

    public CharSequence getPackageName()
    {
        return IMPL.getPackageName(mInfo);
    }

    public CharSequence getText()
    {
        return IMPL.getText(mInfo);
    }

    public String getViewIdResourceName()
    {
        return IMPL.getViewIdResourceName(mInfo);
    }

    public int hashCode()
    {
        if (mInfo == null)
        {
            return 0;
        } else
        {
            return mInfo.hashCode();
        }
    }

    public boolean isAccessibilityFocused()
    {
        return IMPL.isAccessibilityFocused(mInfo);
    }

    public boolean isCheckable()
    {
        return IMPL.isCheckable(mInfo);
    }

    public boolean isChecked()
    {
        return IMPL.isChecked(mInfo);
    }

    public boolean isClickable()
    {
        return IMPL.isClickable(mInfo);
    }

    public boolean isEnabled()
    {
        return IMPL.isEnabled(mInfo);
    }

    public boolean isFocusable()
    {
        return IMPL.isFocusable(mInfo);
    }

    public boolean isFocused()
    {
        return IMPL.isFocused(mInfo);
    }

    public boolean isLongClickable()
    {
        return IMPL.isLongClickable(mInfo);
    }

    public boolean isPassword()
    {
        return IMPL.isPassword(mInfo);
    }

    public boolean isScrollable()
    {
        return IMPL.isScrollable(mInfo);
    }

    public boolean isSelected()
    {
        return IMPL.isSelected(mInfo);
    }

    public boolean isVisibleToUser()
    {
        return IMPL.isVisibleToUser(mInfo);
    }

    public void recycle()
    {
        IMPL.recycle(mInfo);
    }

    public void setAccessibilityFocused(boolean flag)
    {
        IMPL.setAccessibilityFocused(mInfo, flag);
    }

    public void setBoundsInParent(Rect rect)
    {
        IMPL.setBoundsInParent(mInfo, rect);
    }

    public void setBoundsInScreen(Rect rect)
    {
        IMPL.setBoundsInScreen(mInfo, rect);
    }

    public void setClassName(CharSequence charsequence)
    {
        IMPL.setClassName(mInfo, charsequence);
    }

    public void setClickable(boolean flag)
    {
        IMPL.setClickable(mInfo, flag);
    }

    public void setContentDescription(CharSequence charsequence)
    {
        IMPL.setContentDescription(mInfo, charsequence);
    }

    public void setEnabled(boolean flag)
    {
        IMPL.setEnabled(mInfo, flag);
    }

    public void setFocusable(boolean flag)
    {
        IMPL.setFocusable(mInfo, flag);
    }

    public void setFocused(boolean flag)
    {
        IMPL.setFocused(mInfo, flag);
    }

    public void setLongClickable(boolean flag)
    {
        IMPL.setLongClickable(mInfo, flag);
    }

    public void setMovementGranularities(int i)
    {
        IMPL.setMovementGranularities(mInfo, i);
    }

    public void setPackageName(CharSequence charsequence)
    {
        IMPL.setPackageName(mInfo, charsequence);
    }

    public void setParent(View view)
    {
        IMPL.setParent(mInfo, view);
    }

    public void setScrollable(boolean flag)
    {
        IMPL.setScrollable(mInfo, flag);
    }

    public void setSelected(boolean flag)
    {
        IMPL.setSelected(mInfo, flag);
    }

    public void setSource(View view)
    {
        IMPL.setSource(mInfo, view);
    }

    public void setVisibleToUser(boolean flag)
    {
        IMPL.setVisibleToUser(mInfo, flag);
    }

    public String toString()
    {
        boolean flag = a;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(super.toString());
        Rect rect = new Rect();
        getBoundsInParent(rect);
        stringbuilder.append((new StringBuilder()).append(z[30]).append(rect).toString());
        getBoundsInScreen(rect);
        stringbuilder.append((new StringBuilder()).append(z[22]).append(rect).toString());
        stringbuilder.append(z[36]).append(getPackageName());
        stringbuilder.append(z[31]).append(getClassName());
        stringbuilder.append(z[28]).append(getText());
        stringbuilder.append(z[26]).append(getContentDescription());
        stringbuilder.append(z[32]).append(getViewIdResourceName());
        stringbuilder.append(z[33]).append(isCheckable());
        stringbuilder.append(z[35]).append(isChecked());
        stringbuilder.append(z[24]).append(isFocusable());
        stringbuilder.append(z[27]).append(isFocused());
        stringbuilder.append(z[23]).append(isSelected());
        stringbuilder.append(z[34]).append(isClickable());
        stringbuilder.append(z[29]).append(isLongClickable());
        stringbuilder.append(z[20]).append(isEnabled());
        stringbuilder.append(z[37]).append(isPassword());
        stringbuilder.append((new StringBuilder()).append(z[19]).append(isScrollable()).toString());
        stringbuilder.append(z[21]);
        int i = getActions();
        do
        {
            if (i == 0)
            {
                break;
            }
            int j = 1 << Integer.numberOfTrailingZeros(i);
            i &= ~j;
            stringbuilder.append(getActionSymbolicName(j));
            if (i != 0)
            {
                stringbuilder.append(z[25]);
            }
            if (!flag)
            {
                continue;
            }
            Fragment.a++;
            break;
        } while (true);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[38];
        obj = "L\016\024TnC\022\023^sB\001\fBgB\037\027\\sI";
        byte0 = -1;
        i = 0;
_L10:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L7:
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "L\016\024TnC\022\001^bH\036\023TcD\001\tIxR\013\017^t^";
                byte0 = 0;
                continue; /* Loop/switch isn't completed */

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "L\016\024TnC\022\016XyY\022\001I~@\002\026XlH\003\024Bf_\f\016HmL\037\tIx";
                byte0 = 1;
                continue; /* Loop/switch isn't completed */

            case 1: // '\001'
                as1[i] = ((String) (obj));
                i = 3;
                obj = "L\016\024TnC\022\fRoJ\022\003QhN\006";
                byte0 = 2;
                continue; /* Loop/switch isn't completed */

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "L\016\024TnC\022\020Od[\004\017HrR\f\024BlB\033\005PdC\031\037ZsL\003\025Q`_\004\024D";
                byte0 = 3;
                continue; /* Loop/switch isn't completed */

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "L\016\024TnC\022\023^sB\001\fBcL\016\013J`_\t";
                byte0 = 4;
                continue; /* Loop/switch isn't completed */

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "L\016\024TnC\022\003RqT";
                byte0 = 5;
                continue; /* Loop/switch isn't completed */

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "L\016\024TnC\022\006RbX\036";
                byte0 = 6;
                continue; /* Loop/switch isn't completed */

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "L\016\024TnC\022\025SjC\002\027S";
                byte0 = 7;
                continue; /* Loop/switch isn't completed */

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "L\016\024TnC\022\020\\rY\b";
                byte0 = 8;
                continue; /* Loop/switch isn't completed */

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "L\016\024TnC\022\023XuR\036\005QdN\031\tRo";
                byte0 = 9;
                continue; /* Loop/switch isn't completed */

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "L\016\024TnC\022\003QdL\037\037NdA\b\003IhB\003";
                byte0 = 10;
                continue; /* Loop/switch isn't completed */

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "L\016\024TnC\022\003QdL\037\037[nN\030\023";
                byte0 = 11;
                continue; /* Loop/switch isn't completed */

            case 11: // '\013'
                as1[i] = ((String) (obj));
                obj = "L\016\024TnC\022\003Hu";
                byte0 = 12;
                i = 13;
                continue; /* Loop/switch isn't completed */

            case 12: // '\f'
                as1[i] = ((String) (obj));
                obj = "L\016\024TnC\022\020Od[\004\017HrR\005\024PmR\b\fXlH\003\024";
                i = 14;
                byte0 = 13;
                continue; /* Loop/switch isn't completed */

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "L\016\024TnC\022\003QdL\037\037\\bN\b\023NhO\004\fTuT\022\006RbX\036";
                byte0 = 14;
                continue; /* Loop/switch isn't completed */

            case 14: // '\016'
                as1[i] = ((String) (obj));
                obj = "L\016\024TnC\022\016XyY\022\bIlA\022\005Qd@\b\016I";
                byte0 = 15;
                i = 16;
                continue; /* Loop/switch isn't completed */

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "L\016\024TnC\022\003QhN\006";
                byte0 = 16;
                continue; /* Loop/switch isn't completed */

            case 16: // '\020'
                as1[i] = ((String) (obj));
                obj = "L\016\024TnC\022\023XmH\016\024";
                byte0 = 17;
                i = 18;
                continue; /* Loop/switch isn't completed */

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "6m3~Sb!,|Ca(z=";
                byte0 = 18;
                continue; /* Loop/switch isn't completed */

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "6m%s@o!%y\033-";
                byte0 = 19;
                continue; /* Loop/switch isn't completed */

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "6m\033";
                byte0 = 20;
                continue; /* Loop/switch isn't completed */

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "6m\"rTc)3TO^.2xDcw`";
                byte0 = 21;
                continue; /* Loop/switch isn't completed */

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "6m3xMh.4xE7m";
                byte0 = 22;
                continue; /* Loop/switch isn't completed */

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "6m&rBx>!\177Mhw`";
                byte0 = 23;
                continue; /* Loop/switch isn't completed */

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "!m";
                byte0 = 24;
                continue; /* Loop/switch isn't completed */

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "6m#rOy(.ieh>#oH}9)rO7m";
                byte0 = 25;
                continue; /* Loop/switch isn't completed */

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "6m&rBx>%y\033-";
                byte0 = 26;
                continue; /* Loop/switch isn't completed */

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "6m4xYyw`";
                byte0 = 27;
                continue; /* Loop/switch isn't completed */

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "6m,rOj\016,tBf,\"qD7m";
                byte0 = 28;
                continue; /* Loop/switch isn't completed */

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "6m\"rTc)3TO],2xOyw`";
                byte0 = 29;
                continue; /* Loop/switch isn't completed */

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "6m#q@~>\016|Lhw`";
                byte0 = 30;
                continue; /* Loop/switch isn't completed */

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "6m6tDz\004$'\001";
                byte0 = 31;
                continue; /* Loop/switch isn't completed */

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "6m#uDn&!\177Mhw`";
                byte0 = 32;
                continue; /* Loop/switch isn't completed */

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "6m#qHn&!\177Mhw`";
                byte0 = 33;
                continue; /* Loop/switch isn't completed */

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "6m#uDn&%y\033-";
                byte0 = 34;
                continue; /* Loop/switch isn't completed */

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "6m0|Bf,'xol %'\001";
                byte0 = 35;
                continue; /* Loop/switch isn't completed */

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "6m0|R~:/oE7m";
                byte0 = 36;
                continue; /* Loop/switch isn't completed */

            case 36: // '$'
                as1[i] = ((String) (obj));
                z = as;
                byte byte1;
                char c;
                if (android.os.Build.VERSION.SDK_INT >= 21)
                {
                    IMPL = new AccessibilityNodeInfoApi21Impl();
                } else
                if (android.os.Build.VERSION.SDK_INT >= 19)
                {
                    IMPL = new AccessibilityNodeInfoKitKatImpl();
                } else
                if (android.os.Build.VERSION.SDK_INT >= 18)
                {
                    IMPL = new AccessibilityNodeInfoJellybeanMr2Impl();
                } else
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    IMPL = new AccessibilityNodeInfoJellybeanImpl();
                } else
                if (android.os.Build.VERSION.SDK_INT >= 14)
                {
                    IMPL = new AccessibilityNodeInfoIcsImpl();
                } else
                {
                    IMPL = new AccessibilityNodeInfoStubImpl();
                }
                break;
            }
            break MISSING_BLOCK_LABEL_1073;
        }
        c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 936
    //                   0 959
    //                   1 966
    //                   2 973
    //                   3 980;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_980;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte1 = 33;
_L8:
        obj[j] = (char)(byte1 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte1 = 13;
          goto _L8
_L3:
        byte1 = 77;
          goto _L8
_L4:
        byte1 = 64;
          goto _L8
        byte1 = 29;
          goto _L8
        if (true) goto _L10; else goto _L9
_L9:
    }

    private class AccessibilityNodeInfoImpl
    {

        public abstract void addAction(Object obj, int i);

        public abstract void addChild(Object obj, View view);

        public abstract int getActions(Object obj);

        public abstract void getBoundsInParent(Object obj, Rect rect);

        public abstract void getBoundsInScreen(Object obj, Rect rect);

        public abstract CharSequence getClassName(Object obj);

        public abstract CharSequence getContentDescription(Object obj);

        public abstract int getMovementGranularities(Object obj);

        public abstract CharSequence getPackageName(Object obj);

        public abstract CharSequence getText(Object obj);

        public abstract String getViewIdResourceName(Object obj);

        public abstract boolean isAccessibilityFocused(Object obj);

        public abstract boolean isCheckable(Object obj);

        public abstract boolean isChecked(Object obj);

        public abstract boolean isClickable(Object obj);

        public abstract boolean isEnabled(Object obj);

        public abstract boolean isFocusable(Object obj);

        public abstract boolean isFocused(Object obj);

        public abstract boolean isLongClickable(Object obj);

        public abstract boolean isPassword(Object obj);

        public abstract boolean isScrollable(Object obj);

        public abstract boolean isSelected(Object obj);

        public abstract boolean isVisibleToUser(Object obj);

        public abstract Object obtain(Object obj);

        public abstract void recycle(Object obj);

        public abstract void setAccessibilityFocused(Object obj, boolean flag);

        public abstract void setBoundsInParent(Object obj, Rect rect);

        public abstract void setBoundsInScreen(Object obj, Rect rect);

        public abstract void setClassName(Object obj, CharSequence charsequence);

        public abstract void setClickable(Object obj, boolean flag);

        public abstract void setContentDescription(Object obj, CharSequence charsequence);

        public abstract void setEnabled(Object obj, boolean flag);

        public abstract void setFocusable(Object obj, boolean flag);

        public abstract void setFocused(Object obj, boolean flag);

        public abstract void setLongClickable(Object obj, boolean flag);

        public abstract void setMovementGranularities(Object obj, int i);

        public abstract void setPackageName(Object obj, CharSequence charsequence);

        public abstract void setParent(Object obj, View view);

        public abstract void setScrollable(Object obj, boolean flag);

        public abstract void setSelected(Object obj, boolean flag);

        public abstract void setSource(Object obj, View view);

        public abstract void setVisibleToUser(Object obj, boolean flag);
    }


    private class AccessibilityNodeInfoApi21Impl extends AccessibilityNodeInfoKitKatImpl
    {
        private class AccessibilityNodeInfoKitKatImpl extends AccessibilityNodeInfoJellybeanMr2Impl
        {
            private class AccessibilityNodeInfoJellybeanMr2Impl extends AccessibilityNodeInfoJellybeanImpl
            {
                private class AccessibilityNodeInfoJellybeanImpl extends AccessibilityNodeInfoIcsImpl
                {
                    private class AccessibilityNodeInfoIcsImpl extends AccessibilityNodeInfoStubImpl
                    {
                        private class AccessibilityNodeInfoStubImpl
                            implements AccessibilityNodeInfoImpl
                        {

                            public void addAction(Object obj, int i)
                            {
                            }

                            public void addChild(Object obj, View view)
                            {
                            }

                            public int getActions(Object obj)
                            {
                                return 0;
                            }

                            public void getBoundsInParent(Object obj, Rect rect)
                            {
                            }

                            public void getBoundsInScreen(Object obj, Rect rect)
                            {
                            }

                            public CharSequence getClassName(Object obj)
                            {
                                return null;
                            }

                            public CharSequence getContentDescription(Object obj)
                            {
                                return null;
                            }

                            public int getMovementGranularities(Object obj)
                            {
                                return 0;
                            }

                            public CharSequence getPackageName(Object obj)
                            {
                                return null;
                            }

                            public CharSequence getText(Object obj)
                            {
                                return null;
                            }

                            public String getViewIdResourceName(Object obj)
                            {
                                return null;
                            }

                            public boolean isAccessibilityFocused(Object obj)
                            {
                                return false;
                            }

                            public boolean isCheckable(Object obj)
                            {
                                return false;
                            }

                            public boolean isChecked(Object obj)
                            {
                                return false;
                            }

                            public boolean isClickable(Object obj)
                            {
                                return false;
                            }

                            public boolean isEnabled(Object obj)
                            {
                                return false;
                            }

                            public boolean isFocusable(Object obj)
                            {
                                return false;
                            }

                            public boolean isFocused(Object obj)
                            {
                                return false;
                            }

                            public boolean isLongClickable(Object obj)
                            {
                                return false;
                            }

                            public boolean isPassword(Object obj)
                            {
                                return false;
                            }

                            public boolean isScrollable(Object obj)
                            {
                                return false;
                            }

                            public boolean isSelected(Object obj)
                            {
                                return false;
                            }

                            public boolean isVisibleToUser(Object obj)
                            {
                                return false;
                            }

                            public Object obtain(Object obj)
                            {
                                return null;
                            }

                            public void recycle(Object obj)
                            {
                            }

                            public void setAccessibilityFocused(Object obj, boolean flag)
                            {
                            }

                            public void setBoundsInParent(Object obj, Rect rect)
                            {
                            }

                            public void setBoundsInScreen(Object obj, Rect rect)
                            {
                            }

                            public void setClassName(Object obj, CharSequence charsequence)
                            {
                            }

                            public void setClickable(Object obj, boolean flag)
                            {
                            }

                            public void setContentDescription(Object obj, CharSequence charsequence)
                            {
                            }

                            public void setEnabled(Object obj, boolean flag)
                            {
                            }

                            public void setFocusable(Object obj, boolean flag)
                            {
                            }

                            public void setFocused(Object obj, boolean flag)
                            {
                            }

                            public void setLongClickable(Object obj, boolean flag)
                            {
                            }

                            public void setMovementGranularities(Object obj, int i)
                            {
                            }

                            public void setPackageName(Object obj, CharSequence charsequence)
                            {
                            }

                            public void setParent(Object obj, View view)
                            {
                            }

                            public void setScrollable(Object obj, boolean flag)
                            {
                            }

                            public void setSelected(Object obj, boolean flag)
                            {
                            }

                            public void setSource(Object obj, View view)
                            {
                            }

                            public void setVisibleToUser(Object obj, boolean flag)
                            {
                            }

                            AccessibilityNodeInfoStubImpl()
                            {
                            }
                        }


                        public void addAction(Object obj, int i)
                        {
                            AccessibilityNodeInfoCompatIcs.addAction(obj, i);
                        }

                        public void addChild(Object obj, View view)
                        {
                            AccessibilityNodeInfoCompatIcs.addChild(obj, view);
                        }

                        public int getActions(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.getActions(obj);
                        }

                        public void getBoundsInParent(Object obj, Rect rect)
                        {
                            AccessibilityNodeInfoCompatIcs.getBoundsInParent(obj, rect);
                        }

                        public void getBoundsInScreen(Object obj, Rect rect)
                        {
                            AccessibilityNodeInfoCompatIcs.getBoundsInScreen(obj, rect);
                        }

                        public CharSequence getClassName(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.getClassName(obj);
                        }

                        public CharSequence getContentDescription(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.getContentDescription(obj);
                        }

                        public CharSequence getPackageName(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.getPackageName(obj);
                        }

                        public CharSequence getText(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.getText(obj);
                        }

                        public boolean isCheckable(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isCheckable(obj);
                        }

                        public boolean isChecked(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isChecked(obj);
                        }

                        public boolean isClickable(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isClickable(obj);
                        }

                        public boolean isEnabled(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isEnabled(obj);
                        }

                        public boolean isFocusable(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isFocusable(obj);
                        }

                        public boolean isFocused(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isFocused(obj);
                        }

                        public boolean isLongClickable(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isLongClickable(obj);
                        }

                        public boolean isPassword(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isPassword(obj);
                        }

                        public boolean isScrollable(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isScrollable(obj);
                        }

                        public boolean isSelected(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.isSelected(obj);
                        }

                        public Object obtain(Object obj)
                        {
                            return AccessibilityNodeInfoCompatIcs.obtain(obj);
                        }

                        public void recycle(Object obj)
                        {
                            AccessibilityNodeInfoCompatIcs.recycle(obj);
                        }

                        public void setBoundsInParent(Object obj, Rect rect)
                        {
                            AccessibilityNodeInfoCompatIcs.setBoundsInParent(obj, rect);
                        }

                        public void setBoundsInScreen(Object obj, Rect rect)
                        {
                            AccessibilityNodeInfoCompatIcs.setBoundsInScreen(obj, rect);
                        }

                        public void setClassName(Object obj, CharSequence charsequence)
                        {
                            AccessibilityNodeInfoCompatIcs.setClassName(obj, charsequence);
                        }

                        public void setClickable(Object obj, boolean flag)
                        {
                            AccessibilityNodeInfoCompatIcs.setClickable(obj, flag);
                        }

                        public void setContentDescription(Object obj, CharSequence charsequence)
                        {
                            AccessibilityNodeInfoCompatIcs.setContentDescription(obj, charsequence);
                        }

                        public void setEnabled(Object obj, boolean flag)
                        {
                            AccessibilityNodeInfoCompatIcs.setEnabled(obj, flag);
                        }

                        public void setFocusable(Object obj, boolean flag)
                        {
                            AccessibilityNodeInfoCompatIcs.setFocusable(obj, flag);
                        }

                        public void setFocused(Object obj, boolean flag)
                        {
                            AccessibilityNodeInfoCompatIcs.setFocused(obj, flag);
                        }

                        public void setLongClickable(Object obj, boolean flag)
                        {
                            AccessibilityNodeInfoCompatIcs.setLongClickable(obj, flag);
                        }

                        public void setPackageName(Object obj, CharSequence charsequence)
                        {
                            AccessibilityNodeInfoCompatIcs.setPackageName(obj, charsequence);
                        }

                        public void setParent(Object obj, View view)
                        {
                            AccessibilityNodeInfoCompatIcs.setParent(obj, view);
                        }

                        public void setScrollable(Object obj, boolean flag)
                        {
                            AccessibilityNodeInfoCompatIcs.setScrollable(obj, flag);
                        }

                        public void setSelected(Object obj, boolean flag)
                        {
                            AccessibilityNodeInfoCompatIcs.setSelected(obj, flag);
                        }

                        public void setSource(Object obj, View view)
                        {
                            AccessibilityNodeInfoCompatIcs.setSource(obj, view);
                        }

                        AccessibilityNodeInfoIcsImpl()
                        {
                        }
                    }


                    public int getMovementGranularities(Object obj)
                    {
                        return AccessibilityNodeInfoCompatJellyBean.getMovementGranularities(obj);
                    }

                    public boolean isAccessibilityFocused(Object obj)
                    {
                        return AccessibilityNodeInfoCompatJellyBean.isAccessibilityFocused(obj);
                    }

                    public boolean isVisibleToUser(Object obj)
                    {
                        return AccessibilityNodeInfoCompatJellyBean.isVisibleToUser(obj);
                    }

                    public void setAccessibilityFocused(Object obj, boolean flag)
                    {
                        AccessibilityNodeInfoCompatJellyBean.setAccesibilityFocused(obj, flag);
                    }

                    public void setMovementGranularities(Object obj, int i)
                    {
                        AccessibilityNodeInfoCompatJellyBean.setMovementGranularities(obj, i);
                    }

                    public void setVisibleToUser(Object obj, boolean flag)
                    {
                        AccessibilityNodeInfoCompatJellyBean.setVisibleToUser(obj, flag);
                    }

                    AccessibilityNodeInfoJellybeanImpl()
                    {
                    }
                }


                public String getViewIdResourceName(Object obj)
                {
                    return AccessibilityNodeInfoCompatJellybeanMr2.getViewIdResourceName(obj);
                }

                AccessibilityNodeInfoJellybeanMr2Impl()
                {
                }
            }


            AccessibilityNodeInfoKitKatImpl()
            {
            }
        }


        AccessibilityNodeInfoApi21Impl()
        {
        }
    }

}
