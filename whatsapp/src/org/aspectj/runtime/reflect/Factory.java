// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.StringTokenizer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.AdviceSignature;
import org.aspectj.lang.reflect.CatchClauseSignature;
import org.aspectj.lang.reflect.ConstructorSignature;
import org.aspectj.lang.reflect.FieldSignature;
import org.aspectj.lang.reflect.InitializerSignature;
import org.aspectj.lang.reflect.LockSignature;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.lang.reflect.SourceLocation;
import org.aspectj.lang.reflect.UnlockSignature;

// Referenced classes of package org.aspectj.runtime.reflect:
//            MethodSignatureImpl, ConstructorSignatureImpl, JoinPointImpl, AdviceSignatureImpl, 
//            SignatureImpl, CatchClauseSignatureImpl, FieldSignatureImpl, InitializerSignatureImpl, 
//            LockSignatureImpl, SourceLocationImpl, UnlockSignatureImpl

public final class Factory
{

    private static Object NO_ARGS[] = new Object[0];
    static Class class$java$lang$ClassNotFoundException;
    static Hashtable prims;
    int count;
    String filename;
    Class lexicalClass;
    ClassLoader lookupClassLoader;

    public Factory(String s, Class class1)
    {
        filename = s;
        lexicalClass = class1;
        count = 0;
        lookupClassLoader = class1.getClassLoader();
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoClassDefFoundError(s.getMessage());
        }
        return s;
    }

    static Class makeClass(String s, ClassLoader classloader)
    {
        if (!s.equals("*")) goto _L2; else goto _L1
_L1:
        Class class1 = null;
_L4:
        return class1;
_L2:
        Class class2;
        class2 = (Class)prims.get(s);
        class1 = class2;
        if (class2 != null) goto _L4; else goto _L3
_L3:
        if (classloader != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        return Class.forName(s);
        s = Class.forName(s, false, classloader);
        return s;
        s;
        if (class$java$lang$ClassNotFoundException == null)
        {
            s = _mthclass$("java.lang.ClassNotFoundException");
            class$java$lang$ClassNotFoundException = s;
        } else
        {
            s = class$java$lang$ClassNotFoundException;
        }
        return s;
    }

    public static org.aspectj.lang.JoinPoint.StaticPart makeEncSJP(Member member)
    {
        String s;
        if (member instanceof Method)
        {
            member = (Method)member;
            member = new MethodSignatureImpl(member.getModifiers(), member.getName(), member.getDeclaringClass(), member.getParameterTypes(), new String[member.getParameterTypes().length], member.getExceptionTypes(), member.getReturnType());
            s = "method-execution";
        } else
        if (member instanceof Constructor)
        {
            member = (Constructor)member;
            member = new ConstructorSignatureImpl(member.getModifiers(), member.getDeclaringClass(), member.getParameterTypes(), new String[member.getParameterTypes().length], member.getExceptionTypes());
            s = "constructor-execution";
        } else
        {
            throw new IllegalArgumentException("member must be either a method or constructor");
        }
        return new JoinPointImpl.EnclosingStaticPartImpl(-1, s, member, null);
    }

    public static JoinPoint makeJP(org.aspectj.lang.JoinPoint.StaticPart staticpart, Object obj, Object obj1)
    {
        return new JoinPointImpl(staticpart, obj, obj1, NO_ARGS);
    }

    public static JoinPoint makeJP(org.aspectj.lang.JoinPoint.StaticPart staticpart, Object obj, Object obj1, Object obj2)
    {
        return new JoinPointImpl(staticpart, obj, obj1, new Object[] {
            obj2
        });
    }

    public static JoinPoint makeJP(org.aspectj.lang.JoinPoint.StaticPart staticpart, Object obj, Object obj1, Object obj2, Object obj3)
    {
        return new JoinPointImpl(staticpart, obj, obj1, new Object[] {
            obj2, obj3
        });
    }

    public static JoinPoint makeJP(org.aspectj.lang.JoinPoint.StaticPart staticpart, Object obj, Object obj1, Object aobj[])
    {
        return new JoinPointImpl(staticpart, obj, obj1, aobj);
    }

    public AdviceSignature makeAdviceSig(int i, String s, Class class1, Class aclass[], String as[], Class aclass1[], Class class2)
    {
        s = new AdviceSignatureImpl(i, s, class1, aclass, as, aclass1, class2);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public AdviceSignature makeAdviceSig(String s)
    {
        s = new AdviceSignatureImpl(s);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public AdviceSignature makeAdviceSig(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        int l = Integer.parseInt(s, 16);
        s = makeClass(s2, lookupClassLoader);
        s3 = new StringTokenizer(s3, ":");
        int i1 = s3.countTokens();
        s2 = new Class[i1];
        for (int i = 0; i < i1; i++)
        {
            s2[i] = makeClass(s3.nextToken(), lookupClassLoader);
        }

        s4 = new StringTokenizer(s4, ":");
        i1 = s4.countTokens();
        s3 = new String[i1];
        for (int j = 0; j < i1; j++)
        {
            s3[j] = s4.nextToken();
        }

        s4 = new StringTokenizer(s5, ":");
        i1 = s4.countTokens();
        s5 = new Class[i1];
        for (int k = 0; k < i1; k++)
        {
            s5[k] = makeClass(s4.nextToken(), lookupClassLoader);
        }

        s = new AdviceSignatureImpl(l, s1, s, s2, s3, s5, makeClass(s6, lookupClassLoader));
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public CatchClauseSignature makeCatchClauseSig(Class class1, Class class2, String s)
    {
        class1 = new CatchClauseSignatureImpl(class1, class2, s);
        class1.setLookupClassLoader(lookupClassLoader);
        return class1;
    }

    public CatchClauseSignature makeCatchClauseSig(String s)
    {
        s = new CatchClauseSignatureImpl(s);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public CatchClauseSignature makeCatchClauseSig(String s, String s1, String s2)
    {
        s = new CatchClauseSignatureImpl(makeClass(s, lookupClassLoader), makeClass((new StringTokenizer(s1, ":")).nextToken(), lookupClassLoader), (new StringTokenizer(s2, ":")).nextToken());
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public ConstructorSignature makeConstructorSig(int i, Class class1, Class aclass[], String as[], Class aclass1[])
    {
        class1 = new ConstructorSignatureImpl(i, class1, aclass, as, aclass1);
        class1.setLookupClassLoader(lookupClassLoader);
        return class1;
    }

    public ConstructorSignature makeConstructorSig(String s)
    {
        s = new ConstructorSignatureImpl(s);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public ConstructorSignature makeConstructorSig(String s, String s1, String s2, String s3, String s4)
    {
        int l = Integer.parseInt(s, 16);
        s = makeClass(s1, lookupClassLoader);
        s2 = new StringTokenizer(s2, ":");
        int i1 = s2.countTokens();
        s1 = new Class[i1];
        for (int i = 0; i < i1; i++)
        {
            s1[i] = makeClass(s2.nextToken(), lookupClassLoader);
        }

        s3 = new StringTokenizer(s3, ":");
        i1 = s3.countTokens();
        s2 = new String[i1];
        for (int j = 0; j < i1; j++)
        {
            s2[j] = s3.nextToken();
        }

        s3 = new StringTokenizer(s4, ":");
        i1 = s3.countTokens();
        s4 = new Class[i1];
        for (int k = 0; k < i1; k++)
        {
            s4[k] = makeClass(s3.nextToken(), lookupClassLoader);
        }

        s = new ConstructorSignatureImpl(l, s, s1, s2, s4);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public org.aspectj.lang.JoinPoint.EnclosingStaticPart makeESJP(String s, Signature signature, int i)
    {
        int j = count;
        count = j + 1;
        return new JoinPointImpl.EnclosingStaticPartImpl(j, s, signature, makeSourceLoc(i, -1));
    }

    public org.aspectj.lang.JoinPoint.EnclosingStaticPart makeESJP(String s, Signature signature, int i, int j)
    {
        int k = count;
        count = k + 1;
        return new JoinPointImpl.EnclosingStaticPartImpl(k, s, signature, makeSourceLoc(i, j));
    }

    public org.aspectj.lang.JoinPoint.EnclosingStaticPart makeESJP(String s, Signature signature, SourceLocation sourcelocation)
    {
        int i = count;
        count = i + 1;
        return new JoinPointImpl.EnclosingStaticPartImpl(i, s, signature, sourcelocation);
    }

    public FieldSignature makeFieldSig(int i, String s, Class class1, Class class2)
    {
        s = new FieldSignatureImpl(i, s, class1, class2);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public FieldSignature makeFieldSig(String s)
    {
        s = new FieldSignatureImpl(s);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public FieldSignature makeFieldSig(String s, String s1, String s2, String s3)
    {
        s = new FieldSignatureImpl(Integer.parseInt(s, 16), s1, makeClass(s2, lookupClassLoader), makeClass(s3, lookupClassLoader));
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public InitializerSignature makeInitializerSig(int i, Class class1)
    {
        class1 = new InitializerSignatureImpl(i, class1);
        class1.setLookupClassLoader(lookupClassLoader);
        return class1;
    }

    public InitializerSignature makeInitializerSig(String s)
    {
        s = new InitializerSignatureImpl(s);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public InitializerSignature makeInitializerSig(String s, String s1)
    {
        s = new InitializerSignatureImpl(Integer.parseInt(s, 16), makeClass(s1, lookupClassLoader));
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public LockSignature makeLockSig()
    {
        LockSignatureImpl locksignatureimpl = new LockSignatureImpl(makeClass("Ljava/lang/Object;", lookupClassLoader));
        locksignatureimpl.setLookupClassLoader(lookupClassLoader);
        return locksignatureimpl;
    }

    public LockSignature makeLockSig(Class class1)
    {
        class1 = new LockSignatureImpl(class1);
        class1.setLookupClassLoader(lookupClassLoader);
        return class1;
    }

    public LockSignature makeLockSig(String s)
    {
        s = new LockSignatureImpl(s);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public MethodSignature makeMethodSig(int i, String s, Class class1, Class aclass[], String as[], Class aclass1[], Class class2)
    {
        s = new MethodSignatureImpl(i, s, class1, aclass, as, aclass1, class2);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public MethodSignature makeMethodSig(String s)
    {
        s = new MethodSignatureImpl(s);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    public MethodSignature makeMethodSig(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        int l = Integer.parseInt(s, 16);
        s = makeClass(s2, lookupClassLoader);
        s3 = new StringTokenizer(s3, ":");
        int i1 = s3.countTokens();
        s2 = new Class[i1];
        for (int i = 0; i < i1; i++)
        {
            s2[i] = makeClass(s3.nextToken(), lookupClassLoader);
        }

        s4 = new StringTokenizer(s4, ":");
        i1 = s4.countTokens();
        s3 = new String[i1];
        for (int j = 0; j < i1; j++)
        {
            s3[j] = s4.nextToken();
        }

        s4 = new StringTokenizer(s5, ":");
        i1 = s4.countTokens();
        s5 = new Class[i1];
        for (int k = 0; k < i1; k++)
        {
            s5[k] = makeClass(s4.nextToken(), lookupClassLoader);
        }

        return new MethodSignatureImpl(l, s1, s, s2, s3, s5, makeClass(s6, lookupClassLoader));
    }

    public org.aspectj.lang.JoinPoint.StaticPart makeSJP(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            int i)
    {
        s1 = makeMethodSig(s1, s2, s3, s4, s5, "", s6);
        int j = count;
        count = j + 1;
        return new JoinPointImpl.StaticPartImpl(j, s, s1, makeSourceLoc(i, -1));
    }

    public org.aspectj.lang.JoinPoint.StaticPart makeSJP(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, int i)
    {
        s1 = makeMethodSig(s1, s2, s3, s4, s5, s6, s7);
        int j = count;
        count = j + 1;
        return new JoinPointImpl.StaticPartImpl(j, s, s1, makeSourceLoc(i, -1));
    }

    public org.aspectj.lang.JoinPoint.StaticPart makeSJP(String s, Signature signature, int i)
    {
        int j = count;
        count = j + 1;
        return new JoinPointImpl.StaticPartImpl(j, s, signature, makeSourceLoc(i, -1));
    }

    public org.aspectj.lang.JoinPoint.StaticPart makeSJP(String s, Signature signature, int i, int j)
    {
        int k = count;
        count = k + 1;
        return new JoinPointImpl.StaticPartImpl(k, s, signature, makeSourceLoc(i, j));
    }

    public org.aspectj.lang.JoinPoint.StaticPart makeSJP(String s, Signature signature, SourceLocation sourcelocation)
    {
        int i = count;
        count = i + 1;
        return new JoinPointImpl.StaticPartImpl(i, s, signature, sourcelocation);
    }

    public SourceLocation makeSourceLoc(int i, int j)
    {
        return new SourceLocationImpl(lexicalClass, filename, i);
    }

    public UnlockSignature makeUnlockSig()
    {
        UnlockSignatureImpl unlocksignatureimpl = new UnlockSignatureImpl(makeClass("Ljava/lang/Object;", lookupClassLoader));
        unlocksignatureimpl.setLookupClassLoader(lookupClassLoader);
        return unlocksignatureimpl;
    }

    public UnlockSignature makeUnlockSig(Class class1)
    {
        class1 = new UnlockSignatureImpl(class1);
        class1.setLookupClassLoader(lookupClassLoader);
        return class1;
    }

    public UnlockSignature makeUnlockSig(String s)
    {
        s = new UnlockSignatureImpl(s);
        s.setLookupClassLoader(lookupClassLoader);
        return s;
    }

    static 
    {
        prims = new Hashtable();
        prims.put("void", Void.TYPE);
        prims.put("boolean", Boolean.TYPE);
        prims.put("byte", Byte.TYPE);
        prims.put("char", Character.TYPE);
        prims.put("short", Short.TYPE);
        prims.put("int", Integer.TYPE);
        prims.put("long", Long.TYPE);
        prims.put("float", Float.TYPE);
        prims.put("double", Double.TYPE);
    }
}
