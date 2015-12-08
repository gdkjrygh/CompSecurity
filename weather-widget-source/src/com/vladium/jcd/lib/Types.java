// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.lib;

import com.vladium.jcd.cls.IAccessFlags;
import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public abstract class Types
{
    private static class methodDescriptorCompiler
    {

        private PushbackReader m_in;
        final List m_result = new ArrayList();
        private StringBuffer m_token;

        private void consume(char c)
            throws IOException
        {
            char c1 = (char)m_in.read();
            if (c1 != c)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("consumed '").append(c1).append("' while expecting '").append(c).append("'").toString());
            } else
            {
                return;
            }
        }

        private void newToken()
        {
            m_result.add(m_token.toString());
            m_token.setLength(0);
        }

        void arrayType()
            throws IOException
        {
            consume('[');
            m_token.append('[');
            componentType();
        }

        void baseType()
            throws IOException
        {
            char c = (char)m_in.read();
            switch (c)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("unknown base type: ").append(c).toString());

            case 66: // 'B'
            case 67: // 'C'
            case 68: // 'D'
            case 70: // 'F'
            case 73: // 'I'
            case 74: // 'J'
            case 83: // 'S'
            case 90: // 'Z'
                m_token.append(c);
                break;
            }
        }

        void componentType()
            throws IOException
        {
            fieldType();
        }

        void fieldType()
            throws IOException
        {
            char c = (char)m_in.read();
            m_in.unread(c);
            switch (c)
            {
            default:
                baseType();
                return;

            case 76: // 'L'
                objectType();
                return;

            case 91: // '['
                arrayType();
                break;
            }
        }

        String[] getResult()
        {
            String as[] = new String[m_result.size()];
            m_result.toArray(as);
            return as;
        }

        void methodDescriptor()
            throws IOException
        {
            consume('(');
            do
            {
                char c = (char)m_in.read();
                if (c != ')')
                {
                    m_in.unread(c);
                    parameterDescriptor();
                } else
                {
                    returnDescriptor();
                    return;
                }
            } while (true);
        }

        void objectType()
            throws IOException
        {
            consume('L');
            m_token.append('L');
            do
            {
                char c = (char)m_in.read();
                if (c != ';')
                {
                    m_token.append(c);
                } else
                {
                    m_token.append(';');
                    return;
                }
            } while (true);
        }

        void parameterDescriptor()
            throws IOException
        {
            fieldType();
            newToken();
        }

        void returnDescriptor()
            throws IOException
        {
            char c = (char)m_in.read();
            switch (c)
            {
            default:
                m_in.unread(c);
                fieldType();
                return;

            case 86: // 'V'
                m_token.append(c);
                break;
            }
        }

        methodDescriptorCompiler(String s)
        {
            m_token = new StringBuffer();
            m_in = new PushbackReader(new StringReader(s));
        }
    }

    private static final class signatureCompiler
    {

        private StringBuffer m_desc;

        private void emit(char c)
        {
            m_desc.append(c);
        }

        private void emit(String s)
        {
            m_desc.append(s);
        }

        private void parameterType(Class class1)
        {
            if (class1 == null) goto _L2; else goto _L1
_L1:
            if (!class1.isPrimitive())
            {
                break MISSING_BLOCK_LABEL_123;
            }
            if (Byte.TYPE != class1) goto _L4; else goto _L3
_L3:
            emit('B');
_L2:
            return;
_L4:
            if (Character.TYPE == class1)
            {
                emit('C');
                return;
            }
            if (Double.TYPE == class1)
            {
                emit('D');
                return;
            }
            if (Float.TYPE == class1)
            {
                emit('F');
                return;
            }
            if (Integer.TYPE == class1)
            {
                emit('I');
                return;
            }
            if (Long.TYPE == class1)
            {
                emit('J');
                return;
            }
            if (Short.TYPE == class1)
            {
                emit('S');
                return;
            }
            if (Boolean.TYPE != class1) goto _L2; else goto _L5
_L5:
            emit('Z');
            return;
            if (class1.isArray())
            {
                emit('[');
                parameterType(class1.getComponentType());
                return;
            } else
            {
                emit('L');
                emit(Types.javaNameToVMName(class1.getName()));
                emit(';');
                return;
            }
        }

        private void parameterTypes(Class aclass[])
        {
            if (aclass != null)
            {
                for (int i = 0; i < aclass.length; i++)
                {
                    parameterType(aclass[i]);
                }

            }
        }

        private void returnType(Class class1)
        {
            if (class1 == null || class1 == Void.TYPE)
            {
                emit('V');
                return;
            } else
            {
                parameterType(class1);
                return;
            }
        }

        String signatureDescriptor(Class aclass[], Class class1)
        {
            emit('(');
            parameterTypes(aclass);
            emit(')');
            returnType(class1);
            return m_desc.toString();
        }

        String typeDescriptor(Class class1)
        {
            parameterType(class1);
            return m_desc.toString();
        }

        private signatureCompiler()
        {
            m_desc = new StringBuffer();
        }

    }

    private static class typeDescriptorCompiler
    {

        Class arrayOf(String s)
            throws ClassNotFoundException
        {
            char c = s.charAt(0);
            if (c == '[')
            {
                s = arrayOf(s.substring(1));
            } else
            if (c == 'L')
            {
                s = Class.forName(Types.vmNameToJavaName(s.substring(1, s.length() - 1)));
            } else
            {
                s = primitive(c);
            }
            return Array.newInstance(s, 0).getClass();
        }

        Class descriptorToClass(String s)
            throws ClassNotFoundException
        {
            char c = s.charAt(0);
            if (c == '[')
            {
                return arrayOf(s.substring(1));
            }
            if (c == 'L')
            {
                return Class.forName(Types.vmNameToJavaName(s.substring(1, s.length() - 1)));
            } else
            {
                return primitive(c);
            }
        }

        Class primitive(char c)
            throws ClassNotFoundException
        {
            if (c == 'B')
            {
                return Byte.TYPE;
            }
            if (c == 'C')
            {
                return Character.TYPE;
            }
            if (c == 'D')
            {
                return Double.TYPE;
            }
            if (c == 'F')
            {
                return Float.TYPE;
            }
            if (c == 'I')
            {
                return Integer.TYPE;
            }
            if (c == 'J')
            {
                return Long.TYPE;
            }
            if (c == 'S')
            {
                return Short.TYPE;
            }
            if (c == 'Z')
            {
                return Boolean.TYPE;
            } else
            {
                throw new ClassNotFoundException((new StringBuilder()).append("unknown base type: ").append(c).toString());
            }
        }

        private typeDescriptorCompiler()
        {
        }

    }

    private static class typeDescriptorCompiler2
    {

        String arrayOf(String s)
        {
            char c = s.charAt(0);
            if (c == '[')
            {
                s = arrayOf(s.substring(1));
            } else
            if (c == 'L')
            {
                s = Types.vmNameToJavaName(s.substring(1, s.length() - 1));
            } else
            {
                s = primitive(c);
            }
            return (new StringBuilder()).append(s).append(" []").toString();
        }

        String descriptorToClass(String s)
        {
            char c = s.charAt(0);
            if (c == '[')
            {
                return arrayOf(s.substring(1));
            }
            if (c == 'L')
            {
                return Types.vmNameToJavaName(s.substring(1, s.length() - 1));
            } else
            {
                return primitive(c);
            }
        }

        String primitive(char c)
        {
            switch (c)
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("unknown primitive: ").append(c).toString());

            case 66: // 'B'
                return "byte";

            case 67: // 'C'
                return "char";

            case 68: // 'D'
                return "double";

            case 70: // 'F'
                return "float";

            case 73: // 'I'
                return "int";

            case 74: // 'J'
                return "long";

            case 83: // 'S'
                return "short";

            case 90: // 'Z'
                return "boolean";
            }
        }

        private typeDescriptorCompiler2()
        {
        }

    }


    public Types()
    {
    }

    public static String accessFlagsToString(int i, boolean flag)
    {
        StringBuffer stringbuffer = new StringBuffer();
        boolean flag3 = true;
        boolean flag1 = true;
        if (flag)
        {
            int j = 0;
            while (j < IAccessFlags.ALL_ACC.length) 
            {
                int l = IAccessFlags.ALL_ACC[j];
                flag3 = flag1;
                if ((i & l) != 0)
                {
                    if (flag1)
                    {
                        flag1 = false;
                    } else
                    {
                        stringbuffer.append(" ");
                    }
                    if (l == 32)
                    {
                        stringbuffer.append("super");
                        flag3 = flag1;
                    } else
                    {
                        stringbuffer.append(IAccessFlags.ALL_ACC_NAMES[j]);
                        flag3 = flag1;
                    }
                }
                j++;
                flag1 = flag3;
            }
        } else
        {
            int k = 0;
            boolean flag2 = flag3;
            while (k < IAccessFlags.ALL_ACC.length) 
            {
                boolean flag4 = flag2;
                if ((i & IAccessFlags.ALL_ACC[k]) != 0)
                {
                    if (flag2)
                    {
                        flag2 = false;
                    } else
                    {
                        stringbuffer.append(" ");
                    }
                    stringbuffer.append(IAccessFlags.ALL_ACC_NAMES[k]);
                    flag4 = flag2;
                }
                k++;
                flag2 = flag4;
            }
        }
        return stringbuffer.toString();
    }

    public static String[] descriptorToParameterTypes(String s)
    {
        String as[];
        try
        {
            methodDescriptorCompiler methoddescriptorcompiler = new methodDescriptorCompiler(s);
            methoddescriptorcompiler.methodDescriptor();
            as = methoddescriptorcompiler.getResult();
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("error parsing [").append(s).append("]: ").append(ioexception.toString()).toString());
        }
        return as;
    }

    public static String descriptorToReturnType(String s)
    {
        int i = s.indexOf('(');
        int j = s.lastIndexOf(')');
        if (i < 0 || j <= 0 || i >= j || j >= s.length() - 1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("malformed method descriptor: [").append(s).append("]").toString());
        } else
        {
            return s.substring(j + 1);
        }
    }

    public static Class descriptorToType(String s)
        throws ClassNotFoundException
    {
        return (new typeDescriptorCompiler()).descriptorToClass(s);
    }

    public static String fullMethodDescriptorToFullUserName(String s, String s1, String s2)
    {
        String s3 = s1;
        if ("<init>".equals(s1))
        {
            s3 = simpleClassName(s);
        }
        s1 = s3;
        if ("<clinit>".equals(s3))
        {
            s1 = "<static class initializer>";
        }
        return (new StringBuilder()).append(s).append('.').append(s1).append(' ').append(methodDescriptorToUserName(s2)).toString();
    }

    public static String fullMethodDescriptorToUserName(String s, String s1, String s2)
    {
        String s3 = s1;
        if ("<init>".equals(s1))
        {
            s3 = simpleClassName(s);
        }
        s = s3;
        if ("<clinit>".equals(s3))
        {
            s = "<static class initializer>";
        }
        return (new StringBuilder()).append(s).append(' ').append(methodDescriptorToUserName(s2)).toString();
    }

    public static String getClassPackageName(Class class1)
    {
        class1 = class1.getName();
        int i = class1.lastIndexOf('.');
        if (i >= 0)
        {
            return class1.substring(0, i);
        } else
        {
            return "";
        }
    }

    public static String javaNameToVMName(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.replace('.', '/');
        }
    }

    public static String methodDescriptorToUserName(String s)
    {
        s = descriptorToParameterTypes(s);
        StringBuffer stringbuffer = new StringBuffer("(");
        int i = 0;
        while (i < s.length) 
        {
            if (i > 0)
            {
                stringbuffer.append(", ");
            }
            String s1 = typeDescriptorToUserName(s[i]);
            int j = s1.lastIndexOf('.');
            if (j < 0 || !"java.lang.".equals(s1.substring(0, j + 1)))
            {
                stringbuffer.append(s1);
            } else
            {
                stringbuffer.append(s1.substring(j + 1));
            }
            i++;
        }
        stringbuffer.append(')');
        return stringbuffer.toString();
    }

    public static String signatureToDescriptor(Method method)
    {
        if (method == null)
        {
            throw new IllegalArgumentException("null input: method");
        } else
        {
            return signatureToDescriptor(method.getParameterTypes(), method.getReturnType());
        }
    }

    public static String signatureToDescriptor(Class aclass[], Class class1)
    {
        return (new signatureCompiler()).signatureDescriptor(aclass, class1);
    }

    public static String signatureToMethodDescriptor(String as[], String s)
    {
        StringBuffer stringbuffer = new StringBuffer("(");
        for (int i = 0; i < as.length; i++)
        {
            stringbuffer.append(as[i]);
        }

        stringbuffer.append(')');
        stringbuffer.append(s);
        return stringbuffer.toString();
    }

    private static String simpleClassName(String s)
    {
        int i = s.lastIndexOf('.');
        if (i < 0)
        {
            return s;
        } else
        {
            return s.substring(i + 1);
        }
    }

    public static String typeDescriptorToUserName(String s)
    {
        return (new typeDescriptorCompiler2()).descriptorToClass(s);
    }

    public static String typeToDescriptor(Class class1)
    {
        return (new signatureCompiler()).typeDescriptor(class1);
    }

    public static String vmNameToJavaName(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return s.replace('/', '.');
        }
    }
}
