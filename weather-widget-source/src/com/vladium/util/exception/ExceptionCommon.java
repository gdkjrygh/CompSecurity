// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.exception;

import com.vladium.util.IJREVersion;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

// Referenced classes of package com.vladium.util.exception:
//            AbstractException, AbstractRuntimeException, IThrowableWrapper

abstract class ExceptionCommon
    implements IJREVersion
{

    private static final Class ABSTACT_RUNTIME_EXCEPTION;
    private static final Class ABSTRACT_EXCEPTION;
    private static final boolean EMBED_ERROR_CODE = true;
    static final Enumeration EMPTY_ENUMERATION;
    private static final ResourceBundle EMPTY_RESOURCE_BUNDLE;
    private static final String EOL;
    private static final String NESTED_THROWABLE_HEADER = "[NESTED EXCEPTION]:";
    private static final ResourceBundle ROOT_RESOURCE_BUNDLE;
    private static final String ROOT_RESOURCE_BUNDLE_NAME;
    private static final Class THROWABLE;
    private static final Map s_exceptionCodeMap;

    private ExceptionCommon()
    {
    }

    public static ResourceBundle addExceptionResource(Class class1, String s)
    {
        if (class1 == null || s == null || s.length() <= 0) goto _L2; else goto _L1
_L1:
        if (!ABSTRACT_EXCEPTION.isAssignableFrom(class1) && !ABSTACT_RUNTIME_EXCEPTION.isAssignableFrom(class1))
        {
            throw new Error((new StringBuilder()).append("addExceptionResource(): class [").append(class1).append("] is not a subclass of ").append(ABSTRACT_EXCEPTION.getName()).append(" or ").append(ABSTACT_RUNTIME_EXCEPTION.getName()).toString());
        }
        Object obj;
        Object obj1;
        obj1 = getNameInNamespace(class1, s);
        obj = class1.getClassLoader();
        s = ((String) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        s = ClassLoader.getSystemClassLoader();
        s = ResourceBundle.getBundle(((String) (obj1)), Locale.getDefault(), s);
_L5:
        if (s == null) goto _L2; else goto _L3
_L3:
        obj = s_exceptionCodeMap;
        obj;
        JVM INSTR monitorenter ;
        obj1 = (ResourceBundle)s_exceptionCodeMap.get(class1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        obj;
        JVM INSTR monitorexit ;
        return ((ResourceBundle) (obj1));
        s_exceptionCodeMap.put(class1, s);
        obj;
        JVM INSTR monitorexit ;
        return s;
        class1;
        obj;
        JVM INSTR monitorexit ;
        throw class1;
_L2:
        return null;
        s;
        s = null;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static String getMessage(Class class1, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        class1 = null;
_L5:
        return class1;
_L2:
        if (s.length() <= 0) goto _L4; else goto _L3
_L3:
        String s1 = lookup(class1, s);
        class1 = s;
        if (s1 != null)
        {
            try
            {
                return (new StringBuilder()).append("[").append(s).append("] ").append(s1).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return s;
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
        return "";
    }

    static String getMessage(Class class1, String s, Object aobj[])
    {
        if (s == null)
        {
            class1 = null;
        } else
        {
            String s1 = getMessage(class1, s);
            class1 = s1;
            if (aobj != null)
            {
                class1 = s1;
                if (aobj.length != 0)
                {
                    try
                    {
                        class1 = MessageFormat.format(s1, aobj);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Class class1)
                    {
                        class1 = new StringBuffer((new StringBuilder()).append(s).append(EOL).toString());
                        int i = 0;
                        do
                        {
                            if (i >= aobj.length)
                            {
                                break;
                            }
                            class1.append((new StringBuilder()).append("\t{").append(i).append("} = [").toString());
                            s = ((String) (aobj[i]));
                            try
                            {
                                class1.append(s.toString());
                            }
                            catch (Throwable throwable)
                            {
                                if (s != null)
                                {
                                    class1.append(s.getClass().getName());
                                } else
                                {
                                    class1.append("null");
                                }
                            }
                            class1.append("]");
                            class1.append(EOL);
                            i++;
                        } while (true);
                        return class1.toString();
                    }
                    return class1;
                }
            }
        }
        return class1;
    }

    private static String getNameInNamespace(Class class1, String s)
    {
        if (class1 != null)
        {
            class1 = class1.getName();
            int i = class1.lastIndexOf('.');
            if (i > 0)
            {
                return (new StringBuilder()).append(class1.substring(0, i + 1)).append(s).toString();
            }
        }
        return s;
    }

    private static String lookup(Class class1, String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        class1 = null;
_L7:
        return class1;
_L2:
        if (class1 == null) goto _L4; else goto _L3
_L3:
        Class class2 = class1;
_L8:
        if (class2 == ABSTRACT_EXCEPTION || class2 == ABSTACT_RUNTIME_EXCEPTION || class2 == THROWABLE || class2 == null) goto _L4; else goto _L5
_L5:
        Map map = s_exceptionCodeMap;
        map;
        JVM INSTR monitorenter ;
        Object obj = (ResourceBundle)s_exceptionCodeMap.get(class2);
        class1 = ((Class) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj = addExceptionResource(class2, "exceptions");
        class1 = ((Class) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s_exceptionCodeMap.put(class2, EMPTY_RESOURCE_BUNDLE);
        class1 = ((Class) (obj));
        map;
        JVM INSTR monitorexit ;
        if (class1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = null;
        class1 = class1.getString(s);
        obj = class1;
_L10:
        class1 = ((Class) (obj));
        if (obj != null) goto _L7; else goto _L6
_L6:
        class2 = class2.getSuperclass();
          goto _L8
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
_L4:
        if (ROOT_RESOURCE_BUNDLE == null)
        {
            break; /* Loop/switch isn't completed */
        }
        class1 = null;
        try
        {
            s = ROOT_RESOURCE_BUNDLE.getString(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = class1;
        }
        class1 = s;
        if (s != null) goto _L7; else goto _L9
_L9:
        return null;
        class1;
          goto _L10
    }

    static void printStackTrace(Throwable throwable, PrintStream printstream)
    {
        if (!JRE_1_4_PLUS) goto _L2; else goto _L1
_L1:
        if (!(throwable instanceof IThrowableWrapper)) goto _L4; else goto _L3
_L3:
        ((IThrowableWrapper)throwable).__printStackTrace(printstream);
_L6:
        return;
_L4:
        throwable.printStackTrace(printstream);
        return;
_L2:
        boolean flag = true;
        while (throwable != null) 
        {
            if (flag)
            {
                flag = false;
            } else
            {
                printstream.println();
                printstream.println("[NESTED EXCEPTION]:");
            }
            if (throwable instanceof IThrowableWrapper)
            {
                throwable = (IThrowableWrapper)throwable;
                throwable.__printStackTrace(printstream);
                throwable = throwable.getCause();
            } else
            {
                throwable.printStackTrace(printstream);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void printStackTrace(Throwable throwable, PrintWriter printwriter)
    {
        if (!JRE_1_4_PLUS) goto _L2; else goto _L1
_L1:
        if (!(throwable instanceof IThrowableWrapper)) goto _L4; else goto _L3
_L3:
        ((IThrowableWrapper)throwable).__printStackTrace(printwriter);
_L6:
        return;
_L4:
        throwable.printStackTrace(printwriter);
        return;
_L2:
        boolean flag = true;
        while (throwable != null) 
        {
            if (flag)
            {
                flag = false;
            } else
            {
                printwriter.println();
                printwriter.println("[NESTED EXCEPTION]:");
            }
            if (throwable instanceof IThrowableWrapper)
            {
                throwable = (IThrowableWrapper)throwable;
                throwable.__printStackTrace(printwriter);
                throwable = throwable.getCause();
            } else
            {
                throwable.printStackTrace(printwriter);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        ResourceBundle resourcebundle;
        s_exceptionCodeMap = new HashMap();
        THROWABLE = java/lang/Throwable;
        ABSTRACT_EXCEPTION = com/vladium/util/exception/AbstractException;
        ABSTACT_RUNTIME_EXCEPTION = com/vladium/util/exception/AbstractRuntimeException;
        EMPTY_ENUMERATION = Collections.enumeration(Collections.EMPTY_SET);
        EMPTY_RESOURCE_BUNDLE = new ResourceBundle() {

            public Enumeration getKeys()
            {
                return ExceptionCommon.EMPTY_ENUMERATION;
            }

            public Object handleGetObject(String s)
            {
                return null;
            }

        };
        EOL = System.getProperty("line.separator", "\n");
        ROOT_RESOURCE_BUNDLE_NAME = getNameInNamespace(com/vladium/util/exception/ExceptionCommon, "exceptions");
        resourcebundle = null;
        ResourceBundle resourcebundle1 = ResourceBundle.getBundle(ROOT_RESOURCE_BUNDLE_NAME);
        resourcebundle = resourcebundle1;
_L2:
        ROOT_RESOURCE_BUNDLE = resourcebundle;
        return;
        Throwable throwable;
        throwable;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
