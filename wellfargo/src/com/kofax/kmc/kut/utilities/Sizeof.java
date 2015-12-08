// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities;

import java.io.PrintStream;

public class Sizeof
{

    private static SizeOfNewObject a = null;
    private static final Runtime b = Runtime.getRuntime();

    public Sizeof()
    {
    }

    private static Object a(int i)
    {
        if (a != null);
        return a.genNextNewObject();
    }

    private static void a()
    {
        for (int i = 0; i < 4; i++)
        {
            b();
        }

    }

    private static void b()
    {
        long l = c();
        long l1 = 0x7fffffffffffffffL;
        long l2;
        for (int i = 0; l < l1 && i < 500; l = l2)
        {
            b.runFinalization();
            b.gc();
            Thread.currentThread();
            Thread.yield();
            l2 = c();
            i++;
            l1 = l;
        }

    }

    private static long c()
    {
        return b.totalMemory() - b.freeMemory();
    }

    public static int computeObjectSize(ObjectDataTypes objectdatatypes, int i)
    {
        com/kofax/kmc/kut/utilities/Sizeof;
        JVM INSTR monitorenter ;
        Object aobj[];
        a();
        c();
        aobj = new Object[i];
        int j;
        long l;
        l = 0L;
        j = -1;
_L20:
        if (j >= i) goto _L2; else goto _L1
_L1:
        _cls1.a[objectdatatypes.ordinal()];
        JVM INSTR tableswitch 1 11: default 404
    //                   1 108
    //                   2 119
    //                   3 130
    //                   4 144
    //                   5 157
    //                   6 171
    //                   7 185
    //                   8 199
    //                   9 211
    //                   10 225
    //                   11 239;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
        throw new UnsupportedOperationException("computeObjectSize method: unsupported Object Data Type");
        objectdatatypes;
        com/kofax/kmc/kut/utilities/Sizeof;
        JVM INSTR monitorexit ;
        throw objectdatatypes;
_L4:
        Object obj = new Object();
          goto _L15
_L5:
        obj = new Object();
          goto _L15
_L6:
        obj = new Long(j);
          goto _L15
_L7:
        obj = new Integer(j);
          goto _L15
_L8:
        obj = new Short((short)j);
          goto _L15
_L9:
        obj = new Character((char)j);
          goto _L15
_L10:
        obj = new Byte((byte)j);
          goto _L15
_L11:
        obj = new Boolean(true);
          goto _L15
_L12:
        obj = new Double(j);
          goto _L15
_L13:
        obj = new Float(j);
          goto _L15
_L14:
        obj = a(j);
          goto _L15
_L18:
        a();
        l = c();
          goto _L16
_L2:
        int k;
        a();
        long l1 = c();
        k = Math.round((float)(l1 - l) / (float)i);
        System.out.println((new StringBuilder()).append("'before' heap: ").append(l).append(", 'after' heap: ").append(l1).toString());
        System.out.println((new StringBuilder()).append("heap delta: ").append(l1 - l).append(", {").append(aobj[0].getClass()).append("} size = ").append(k).append(" bytes").toString());
        for (j = 0; j < i; j++)
        {
            aobj[j] = null;
        }

        com/kofax/kmc/kut/utilities/Sizeof;
        JVM INSTR monitorexit ;
        return k;
_L15:
        if (j < 0) goto _L18; else goto _L17
_L17:
        aobj[j] = obj;
_L16:
        j++;
        if (true) goto _L20; else goto _L19
_L19:
    }

    public static void registerNewObjectListener(SizeOfNewObject sizeofnewobject)
    {
        a = sizeofnewobject;
    }


    private class SizeOfNewObject
    {

        public abstract Object genNextNewObject();
    }


    private class _cls1
    {

        static final int a[];

        static 
        {
            a = new int[ObjectDataTypes.values().length];
            try
            {
                a[ObjectDataTypes.DATA_TYPE_OBJECT_SHELL.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_OBJECT_REF.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_LONG_FIELD.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_INT_FIELD.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_SHORT_FIELD.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_CHAR_FIELD.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_BYTE_FIELD.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_BOOLEAN_FIELD.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_DOUBLE_FIELD.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_FLOAT_FIELD.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ObjectDataTypes.DATA_TYPE_APP_CREATED.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class ObjectDataTypes extends Enum
    {

        public static final ObjectDataTypes DATA_TYPE_APP_CREATED;
        public static final ObjectDataTypes DATA_TYPE_BOOLEAN_FIELD;
        public static final ObjectDataTypes DATA_TYPE_BYTE_FIELD;
        public static final ObjectDataTypes DATA_TYPE_CHAR_FIELD;
        public static final ObjectDataTypes DATA_TYPE_DOUBLE_FIELD;
        public static final ObjectDataTypes DATA_TYPE_FLOAT_FIELD;
        public static final ObjectDataTypes DATA_TYPE_INT_FIELD;
        public static final ObjectDataTypes DATA_TYPE_LONG_FIELD;
        public static final ObjectDataTypes DATA_TYPE_OBJECT_REF;
        public static final ObjectDataTypes DATA_TYPE_OBJECT_SHELL;
        public static final ObjectDataTypes DATA_TYPE_SHORT_FIELD;
        private static final ObjectDataTypes a[];

        public static ObjectDataTypes valueOf(String s)
        {
            return (ObjectDataTypes)Enum.valueOf(com/kofax/kmc/kut/utilities/Sizeof$ObjectDataTypes, s);
        }

        public static ObjectDataTypes[] values()
        {
            return (ObjectDataTypes[])a.clone();
        }

        static 
        {
            DATA_TYPE_OBJECT_SHELL = new ObjectDataTypes("DATA_TYPE_OBJECT_SHELL", 0);
            DATA_TYPE_OBJECT_REF = new ObjectDataTypes("DATA_TYPE_OBJECT_REF", 1);
            DATA_TYPE_LONG_FIELD = new ObjectDataTypes("DATA_TYPE_LONG_FIELD", 2);
            DATA_TYPE_INT_FIELD = new ObjectDataTypes("DATA_TYPE_INT_FIELD", 3);
            DATA_TYPE_SHORT_FIELD = new ObjectDataTypes("DATA_TYPE_SHORT_FIELD", 4);
            DATA_TYPE_CHAR_FIELD = new ObjectDataTypes("DATA_TYPE_CHAR_FIELD", 5);
            DATA_TYPE_BYTE_FIELD = new ObjectDataTypes("DATA_TYPE_BYTE_FIELD", 6);
            DATA_TYPE_BOOLEAN_FIELD = new ObjectDataTypes("DATA_TYPE_BOOLEAN_FIELD", 7);
            DATA_TYPE_DOUBLE_FIELD = new ObjectDataTypes("DATA_TYPE_DOUBLE_FIELD", 8);
            DATA_TYPE_FLOAT_FIELD = new ObjectDataTypes("DATA_TYPE_FLOAT_FIELD", 9);
            DATA_TYPE_APP_CREATED = new ObjectDataTypes("DATA_TYPE_APP_CREATED", 10);
            a = (new ObjectDataTypes[] {
                DATA_TYPE_OBJECT_SHELL, DATA_TYPE_OBJECT_REF, DATA_TYPE_LONG_FIELD, DATA_TYPE_INT_FIELD, DATA_TYPE_SHORT_FIELD, DATA_TYPE_CHAR_FIELD, DATA_TYPE_BYTE_FIELD, DATA_TYPE_BOOLEAN_FIELD, DATA_TYPE_DOUBLE_FIELD, DATA_TYPE_FLOAT_FIELD, 
                DATA_TYPE_APP_CREATED
            });
        }

        private ObjectDataTypes(String s, int i)
        {
            super(s, i);
        }
    }

}
