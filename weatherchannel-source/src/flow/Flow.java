// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package flow;

import java.util.Iterator;

// Referenced classes of package flow:
//            Backstack, HasParent

public final class Flow
{
    public static final class Direction extends Enum
    {

        private static final Direction $VALUES[];
        public static final Direction BACKWARD;
        public static final Direction FORWARD;
        public static final Direction REPLACE;

        public static Direction valueOf(String s)
        {
            return (Direction)Enum.valueOf(flow/Flow$Direction, s);
        }

        public static Direction[] values()
        {
            return (Direction[])$VALUES.clone();
        }

        static 
        {
            FORWARD = new Direction("FORWARD", 0);
            BACKWARD = new Direction("BACKWARD", 1);
            REPLACE = new Direction("REPLACE", 2);
            $VALUES = (new Direction[] {
                FORWARD, BACKWARD, REPLACE
            });
        }

        private Direction(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface Listener
    {

        public abstract void go(Backstack backstack1, Direction direction);
    }


    private Backstack backstack;
    private final Listener listener;

    public Flow(Backstack backstack1, Listener listener1)
    {
        listener = listener1;
        backstack = backstack1;
    }

    private static Backstack preserveEquivalentPrefix(Backstack backstack1, Backstack backstack2)
    {
        Backstack.Builder builder;
        backstack1 = backstack1.reverseIterator();
        backstack2 = backstack2.reverseIterator();
        builder = Backstack.emptyBuilder();
_L7:
        if (!backstack2.hasNext()) goto _L2; else goto _L1
_L1:
        Backstack.Entry entry = (Backstack.Entry)backstack2.next();
        if (backstack1.hasNext()) goto _L4; else goto _L3
_L3:
        builder.push(entry.getScreen());
_L2:
        for (; backstack2.hasNext(); builder.push(((Backstack.Entry)backstack2.next()).getScreen())) { }
        break; /* Loop/switch isn't completed */
_L4:
        Backstack.Entry entry1 = (Backstack.Entry)backstack1.next();
        if (entry1.getScreen().equals(entry.getScreen()))
        {
            builder.push(entry1.getScreen());
            continue; /* Loop/switch isn't completed */
        }
        builder.push(entry.getScreen());
        if (true) goto _L2; else goto _L5
_L5:
        return builder.build();
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void replace(Backstack backstack1)
    {
        listener.go(backstack1, Direction.REPLACE);
        backstack = backstack1;
    }

    public void backward(Backstack backstack1)
    {
        listener.go(backstack1, Direction.BACKWARD);
        backstack = backstack1;
    }

    public void forward(Backstack backstack1)
    {
        listener.go(backstack1, Direction.FORWARD);
        backstack = backstack1;
    }

    public Backstack getBackstack()
    {
        return backstack;
    }

    public boolean goBack()
    {
        if (backstack.size() == 1)
        {
            return false;
        } else
        {
            Backstack.Builder builder = backstack.buildUpon();
            builder.pop();
            backward(builder.build());
            return true;
        }
    }

    public void goTo(Object obj)
    {
        forward(backstack.buildUpon().push(obj).build());
    }

    public boolean goUp()
    {
        Object obj = backstack.current().getScreen();
        if (obj instanceof HasParent)
        {
            obj = ((HasParent)obj).getParent();
            backward(preserveEquivalentPrefix(backstack, Backstack.fromUpChain(obj)));
            return true;
        } else
        {
            return false;
        }
    }

    public void replaceTo(Object obj)
    {
        replace(preserveEquivalentPrefix(backstack, Backstack.fromUpChain(obj)));
    }

    public void resetTo(Object obj)
    {
        Backstack.Builder builder = backstack.buildUpon();
        int i = 0;
        Object obj3 = null;
        Object obj2 = null;
        Iterator iterator = backstack.reverseIterator();
        Object obj1;
        do
        {
            obj1 = obj3;
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Backstack.Entry)iterator.next()).getScreen().equals(obj))
            {
                int j = 0;
                obj1 = obj2;
                for (; j < backstack.size() - i; j++)
                {
                    obj1 = builder.pop().getScreen();
                }

                break;
            }
            i++;
        } while (true);
        if (obj1 != null)
        {
            builder.push(obj1);
            backward(builder.build());
            return;
        } else
        {
            builder.push(obj);
            forward(builder.build());
            return;
        }
    }
}
