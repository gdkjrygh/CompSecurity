// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui.dob;


public interface Validator
{
    public static final class Action extends Enum
    {

        private static final Action $VALUES[];
        public static final Action ACCEPT;
        public static final Action PAD;
        public static final Action REJECT;

        public static Action valueOf(String s)
        {
            return (Action)Enum.valueOf(com/walmartlabs/android/pharmacy/ui/dob/Validator$Action, s);
        }

        public static Action[] values()
        {
            return (Action[])$VALUES.clone();
        }

        static 
        {
            ACCEPT = new Action("ACCEPT", 0);
            PAD = new Action("PAD", 1);
            REJECT = new Action("REJECT", 2);
            $VALUES = (new Action[] {
                ACCEPT, PAD, REJECT
            });
        }

        private Action(String s, int i)
        {
            super(s, i);
        }
    }

    public static class Day
        implements Validator
    {

        public Action isValidInput(int ai[], int i, int j)
        {
            switch (i)
            {
            default:
                throw new IllegalStateException();

            case -1: 
                if (j >= 0 && j <= 3)
                {
                    return Action.ACCEPT;
                } else
                {
                    return Action.PAD;
                }

            case 0: // '\0'
            case 1: // '\001'
                i = ai[0] * 10 + j;
                break;
            }
            if (i > 0 && i <= 31)
            {
                return Action.ACCEPT;
            } else
            {
                return Action.REJECT;
            }
        }

        public Day()
        {
        }
    }

    public static class Month
        implements Validator
    {

        public Action isValidInput(int ai[], int i, int j)
        {
            switch (i)
            {
            default:
                throw new IllegalStateException();

            case -1: 
                if (j == 0 || j == 1)
                {
                    return Action.ACCEPT;
                } else
                {
                    return Action.PAD;
                }

            case 0: // '\0'
            case 1: // '\001'
                i = ai[0] * 10 + j;
                break;
            }
            if (i > 0 && i <= 12)
            {
                return Action.ACCEPT;
            } else
            {
                return Action.REJECT;
            }
        }

        public Month()
        {
        }
    }

    public static class Year
        implements Validator
    {

        public Action isValidInput(int ai[], int i, int j)
        {
label0:
            {
                boolean flag1 = true;
                switch (i)
                {
                default:
                    return Action.ACCEPT;

                case -1: 
                    if (j == 1 || j == 2)
                    {
                        return Action.ACCEPT;
                    } else
                    {
                        return Action.REJECT;
                    }

                case 0: // '\0'
                    break;
                }
                boolean flag;
                if (ai[i] == 1)
                {
                    flag = flag1;
                    if (j == 8)
                    {
                        break label0;
                    }
                    flag = flag1;
                    if (j == 9)
                    {
                        break label0;
                    }
                }
                if (ai[i] == 2 && j == 0)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            if (flag)
            {
                return Action.ACCEPT;
            } else
            {
                return Action.REJECT;
            }
        }

        public Year()
        {
        }
    }


    public abstract Action isValidInput(int ai[], int i, int j);
}
