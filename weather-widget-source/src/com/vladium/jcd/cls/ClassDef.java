// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.cls;

import com.vladium.jcd.cls.attribute.AttributeElementFactory;
import com.vladium.jcd.cls.attribute.CodeAttribute_info;
import com.vladium.jcd.cls.attribute.InnerClassesAttribute_info;
import com.vladium.jcd.cls.constant.CONSTANT_Class_info;
import com.vladium.jcd.cls.constant.CONSTANT_Fieldref_info;
import com.vladium.jcd.cls.constant.CONSTANT_NameAndType_info;
import com.vladium.jcd.cls.constant.CONSTANT_String_info;
import com.vladium.jcd.cls.constant.CONSTANT_Utf8_info;
import com.vladium.jcd.compiler.IClassFormatOutput;
import com.vladium.jcd.lib.Types;
import com.vladium.jcd.lib.UDataOutputStream;
import com.vladium.util.ByteArrayOStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

// Referenced classes of package com.vladium.jcd.cls:
//            IAccessFlags, ElementFactory, IClassDefVisitor, IConstantCollection, 
//            Field_info, IFieldCollection, IMethodCollection, IInterfaceCollection, 
//            IAttributeCollection, Method_info

public final class ClassDef
    implements Cloneable, IAccessFlags, IClassFormatOutput
{
    private static final class ConstructorDescriptor
        implements Comparable
    {

        final String m_descriptor;
        final int m_modifiers;

        public final int compareTo(Object obj)
        {
            return m_descriptor.compareTo(((ConstructorDescriptor)obj).m_descriptor);
        }

        ConstructorDescriptor(int i, String s)
        {
            m_modifiers = i;
            m_descriptor = s;
        }
    }

    private static final class FieldDescriptor
        implements Comparable
    {

        final String m_descriptor;
        final int m_modifiers;
        final String m_name;

        public final int compareTo(Object obj)
        {
            return m_name.compareTo(((FieldDescriptor)obj).m_name);
        }

        FieldDescriptor(String s, int i, String s1)
        {
            m_name = s;
            m_modifiers = i;
            m_descriptor = s1;
        }
    }

    private static final class MethodDescriptor
        implements Comparable
    {

        final String m_descriptor;
        final int m_modifiers;
        final String m_name;

        public final int compareTo(Object obj)
        {
            obj = (MethodDescriptor)obj;
            int j = m_name.compareTo(((MethodDescriptor) (obj)).m_name);
            int i = j;
            if (j == 0)
            {
                i = m_descriptor.compareTo(((MethodDescriptor) (obj)).m_descriptor);
            }
            return i;
        }

        MethodDescriptor(String s, int i, String s1)
        {
            m_name = s;
            m_modifiers = i;
            m_descriptor = s1;
        }
    }


    private static final boolean DEBUG_SUID = false;
    private int m_access_flags;
    private IAttributeCollection m_attributes;
    private IConstantCollection m_constants;
    private long m_declaredSUID;
    private IFieldCollection m_fields;
    private IInterfaceCollection m_interfaces;
    private long m_magic;
    private IMethodCollection m_methods;
    private int m_super_class_index;
    private int m_this_class_index;
    private int m_version[];

    public ClassDef()
    {
        m_version = new int[2];
        m_constants = ElementFactory.newConstantCollection(-1);
        m_interfaces = ElementFactory.newInterfaceCollection(-1);
        m_fields = ElementFactory.newFieldCollection(-1);
        m_methods = ElementFactory.newMethodCollection(-1);
        m_attributes = ElementFactory.newAttributeCollection(-1);
    }

    public void accept(IClassDefVisitor iclassdefvisitor, Object obj)
    {
        iclassdefvisitor.visit(this, obj);
    }

    public int addCONSTANT_Utf8(String s, boolean flag)
    {
        if (flag)
        {
            int i = m_constants.findCONSTANT_Utf8(s);
            if (i > 0)
            {
                return i;
            }
        }
        return m_constants.add(new CONSTANT_Utf8_info(s));
    }

    public int addClassref(String s)
    {
        int i = addCONSTANT_Utf8(s, true);
        return m_constants.add(new CONSTANT_Class_info(i));
    }

    public int addField(String s, String s1, int i)
    {
        s = new Field_info(i, addCONSTANT_Utf8(s, true), addCONSTANT_Utf8(s1, true), ElementFactory.newAttributeCollection(0));
        return m_fields.add(s);
    }

    public int addField(String s, String s1, int i, IAttributeCollection iattributecollection)
    {
        s = new Field_info(i, addCONSTANT_Utf8(s, true), addCONSTANT_Utf8(s1, true), iattributecollection);
        return m_fields.add(s);
    }

    public int addFieldref(int i)
    {
        Object obj = m_fields.get(i);
        obj = new CONSTANT_NameAndType_info(((Field_info) (obj)).m_name_index, ((Field_info) (obj)).m_descriptor_index);
        i = m_constants.add(((com.vladium.jcd.cls.constant.CONSTANT_info) (obj)));
        return m_constants.add(new CONSTANT_Fieldref_info(m_this_class_index, i));
    }

    public int addFieldref(Field_info field_info)
    {
        field_info = new CONSTANT_NameAndType_info(field_info.m_name_index, field_info.m_descriptor_index);
        int i = m_constants.add(field_info);
        return m_constants.add(new CONSTANT_Fieldref_info(m_this_class_index, i));
    }

    public int addMethod(Method_info method_info)
    {
        return m_methods.add(method_info);
    }

    public int addNameType(String s, String s1)
    {
        int i = addCONSTANT_Utf8(s, true);
        int j = addCONSTANT_Utf8(s1, true);
        return m_constants.add(new CONSTANT_NameAndType_info(i, j));
    }

    public int addStringConstant(String s)
    {
        int i = addCONSTANT_Utf8(s, true);
        return m_constants.add(new CONSTANT_String_info(i));
    }

    public Object clone()
    {
        ClassDef classdef;
        try
        {
            classdef = (ClassDef)super.clone();
            classdef.m_version = (int[])(int[])m_version.clone();
            classdef.m_constants = (IConstantCollection)m_constants.clone();
            classdef.m_interfaces = (IInterfaceCollection)m_interfaces.clone();
            classdef.m_fields = (IFieldCollection)m_fields.clone();
            classdef.m_methods = (IMethodCollection)m_methods.clone();
            classdef.m_attributes = (IAttributeCollection)m_attributes.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError(clonenotsupportedexception.toString());
        }
        return classdef;
    }

    public final long computeSUID(boolean flag)
    {
        long l2;
        l2 = m_declaredSUID;
        if (l2 != 0L)
        {
            return l2;
        }
        ByteArrayOStream bytearrayostream;
        Object obj;
        int ai[];
        bytearrayostream = new ByteArrayOStream(1024);
        obj = new DataOutputStream(bytearrayostream);
        ((DataOutputStream) (obj)).writeUTF(Types.vmNameToJavaName(getName()));
        ai = new int[1];
        if (!isNested(ai)) goto _L2; else goto _L1
_L1:
        int i = ai[0];
_L5:
        int j;
        int k;
        byte abyte0[];
        IInterfaceCollection iinterfacecollection;
        Object aobj[];
        Object aobj1[];
        Object obj1;
        Object obj2;
        Method_info method_info;
        String s;
        int l;
        boolean flag1;
        int i1;
        int l1;
        int i2;
        try
        {
            ((DataOutputStream) (obj)).writeInt(i & 0x611);
            iinterfacecollection = getInterfaces();
            aobj1 = new String[iinterfacecollection.size()];
            j = aobj1.length;
        }
        catch (IOException ioexception)
        {
            throw new Error(ioexception.getMessage());
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new SecurityException(nosuchalgorithmexception.getMessage());
        }
        i = 0;
_L4:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        aobj1[i] = Types.vmNameToJavaName(((CONSTANT_Class_info)m_constants.get(iinterfacecollection.get(i))).getName(this));
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        i = getAccessFlags();
          goto _L5
_L3:
        Arrays.sort(aobj1);
        i = 0;
_L7:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((DataOutputStream) (obj)).writeUTF(aobj1[i]);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        obj1 = getFields();
        aobj = new FieldDescriptor[((IFieldCollection) (obj1)).size()];
        j = 0;
        l = aobj.length;
        i = 0;
_L21:
        if (j >= l) goto _L9; else goto _L8
_L8:
        obj2 = ((IFieldCollection) (obj1)).get(j);
        i1 = ((Field_info) (obj2)).getAccessFlags();
        if ((i1 & 2) != 0 && (i1 & 0x88) != 0) goto _L11; else goto _L10
_L10:
        k = i + 1;
        aobj[i] = new FieldDescriptor(((Field_info) (obj2)).getName(this), i1, ((Field_info) (obj2)).getDescriptor(this));
        i = k;
          goto _L11
_L9:
        if (i <= 0) goto _L13; else goto _L12
_L12:
        Arrays.sort(aobj, 0, i);
        j = 0;
_L14:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = aobj[j];
        ((DataOutputStream) (obj)).writeUTF(((FieldDescriptor) (obj1)).m_name);
        ((DataOutputStream) (obj)).writeInt(((FieldDescriptor) (obj1)).m_modifiers);
        ((DataOutputStream) (obj)).writeUTF(((FieldDescriptor) (obj1)).m_descriptor);
        j++;
        if (true) goto _L14; else goto _L13
_L13:
        obj2 = getMethods();
        flag1 = false;
        obj1 = new ConstructorDescriptor[((IMethodCollection) (obj2)).size()];
        aobj = new MethodDescriptor[obj1.length];
        k = 0;
        l1 = obj1.length;
        i = 0;
        j = 0;
_L22:
        if (k >= l1)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        method_info = ((IMethodCollection) (obj2)).get(k);
        s = method_info.getName(this);
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_472;
        }
        if ("<clinit>".equals(s))
        {
            flag1 = true;
            i1 = i;
            i = j;
            j = i1;
            break MISSING_BLOCK_LABEL_874;
        }
        i2 = method_info.getAccessFlags();
        if ((i2 & 2) != 0)
        {
            break MISSING_BLOCK_LABEL_850;
        }
        if (!"<init>".equals(s))
        {
            break MISSING_BLOCK_LABEL_534;
        }
        i1 = j + 1;
        obj1[j] = new ConstructorDescriptor(i2, method_info.getDescriptor(this));
        j = i;
        i = i1;
        break MISSING_BLOCK_LABEL_874;
        i1 = i + 1;
        aobj[i] = new MethodDescriptor(s, i2, method_info.getDescriptor(this));
        i = j;
        j = i1;
        break MISSING_BLOCK_LABEL_874;
        if (!flag1 || flag)
        {
            break MISSING_BLOCK_LABEL_602;
        }
        ((DataOutputStream) (obj)).writeUTF("<clinit>");
        ((DataOutputStream) (obj)).writeInt(8);
        ((DataOutputStream) (obj)).writeUTF("()V");
        if (j <= 0) goto _L16; else goto _L15
_L15:
        Arrays.sort(((Object []) (obj1)), 0, j);
        k = 0;
_L17:
        if (k >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = obj1[k];
        ((DataOutputStream) (obj)).writeUTF("<init>");
        ((DataOutputStream) (obj)).writeInt(((ConstructorDescriptor) (obj2)).m_modifiers);
        ((DataOutputStream) (obj)).writeUTF(((ConstructorDescriptor) (obj2)).m_descriptor.replace('/', '.'));
        k++;
        if (true) goto _L17; else goto _L16
_L16:
        if (i <= 0) goto _L19; else goto _L18
_L18:
        Arrays.sort(aobj, 0, i);
        j = 0;
_L20:
        if (j >= i)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = aobj[j];
        ((DataOutputStream) (obj)).writeUTF(((MethodDescriptor) (obj1)).m_name);
        ((DataOutputStream) (obj)).writeInt(((MethodDescriptor) (obj1)).m_modifiers);
        ((DataOutputStream) (obj)).writeUTF(((MethodDescriptor) (obj1)).m_descriptor.replace('/', '.'));
        j++;
        if (true) goto _L20; else goto _L19
_L19:
        ((DataOutputStream) (obj)).flush();
        obj = MessageDigest.getInstance("SHA");
        ((MessageDigest) (obj)).update(bytearrayostream.getByteArray(), 0, bytearrayostream.size());
        abyte0 = ((MessageDigest) (obj)).digest();
        i = Math.min(abyte0.length, 8) - 1;
        while (i >= 0) 
        {
            j = abyte0[i];
            l2 = l2 << 8 | (long)(j & 0xff);
            i--;
        }
        return l2;
        int j1 = i;
        i = j;
        j = j1;
        break MISSING_BLOCK_LABEL_874;
_L11:
        j++;
          goto _L21
        k++;
        int k1 = j;
        j = i;
        i = k1;
          goto _L22
    }

    public final int getAccessFlags()
    {
        return m_access_flags;
    }

    public IAttributeCollection getAttributes()
    {
        return m_attributes;
    }

    public IConstantCollection getConstants()
    {
        return m_constants;
    }

    public final long getDeclaredSUID()
    {
        return m_declaredSUID;
    }

    public IFieldCollection getFields()
    {
        return m_fields;
    }

    public int[] getFields(String s)
    {
        return m_fields.get(this, s);
    }

    public IInterfaceCollection getInterfaces()
    {
        return m_interfaces;
    }

    public long getMagic()
    {
        return m_magic;
    }

    public IMethodCollection getMethods()
    {
        return m_methods;
    }

    public int[] getMethods(String s)
    {
        return m_methods.get(this, s);
    }

    public String getName()
    {
        return getThisClass().getName(this);
    }

    public CONSTANT_Class_info getSuperClass()
    {
        return (CONSTANT_Class_info)m_constants.get(m_super_class_index);
    }

    public int getSuperClassIndex()
    {
        return m_super_class_index;
    }

    public CONSTANT_Class_info getThisClass()
    {
        return (CONSTANT_Class_info)m_constants.get(m_this_class_index);
    }

    public int getThisClassIndex()
    {
        return m_this_class_index;
    }

    public int[] getVersion()
    {
        return m_version;
    }

    public boolean isInterface()
    {
        return (m_access_flags & 0x200) != 0;
    }

    public boolean isNested(int ai[])
    {
        InnerClassesAttribute_info innerclassesattribute_info = m_attributes.getInnerClassesAttribute();
        if (innerclassesattribute_info == null)
        {
            return false;
        } else
        {
            return innerclassesattribute_info.makesClassNested(m_this_class_index, ai);
        }
    }

    public boolean isSynthetic()
    {
        return m_attributes.hasSynthetic();
    }

    public Method_info newEmptyMethod(String s, String s1, int i)
    {
        int j = addCONSTANT_Utf8("Code", true);
        int k = addCONSTANT_Utf8(s, true);
        int l = addCONSTANT_Utf8(s1, true);
        s = ElementFactory.newAttributeCollection(0);
        s.add(new CodeAttribute_info(j, 0, 0, CodeAttribute_info.EMPTY_BYTE_ARRAY, AttributeElementFactory.newExceptionHandlerTable(0), ElementFactory.newAttributeCollection(0)));
        return new Method_info(i, k, l, s);
    }

    public final void setAccessFlags(int i)
    {
        m_access_flags = i;
    }

    public final void setDeclaredSUID(long l)
    {
        m_declaredSUID = l;
    }

    public void setMagic(long l)
    {
        m_magic = l;
    }

    public void setSuperClassIndex(int i)
    {
        m_super_class_index = i;
    }

    public void setThisClassIndex(int i)
    {
        m_this_class_index = i;
    }

    public void setVersion(int ai[])
    {
        m_version[0] = ai[0];
        m_version[1] = ai[1];
    }

    public void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException
    {
        if (udataoutputstream == null)
        {
            throw new IllegalArgumentException("null input: out");
        } else
        {
            udataoutputstream.writeU4(m_magic);
            udataoutputstream.writeU2(m_version[1]);
            udataoutputstream.writeU2(m_version[0]);
            m_constants.writeInClassFormat(udataoutputstream);
            udataoutputstream.writeU2(m_access_flags);
            udataoutputstream.writeU2(m_this_class_index);
            udataoutputstream.writeU2(m_super_class_index);
            m_interfaces.writeInClassFormat(udataoutputstream);
            m_fields.writeInClassFormat(udataoutputstream);
            m_methods.writeInClassFormat(udataoutputstream);
            m_attributes.writeInClassFormat(udataoutputstream);
            return;
        }
    }
}
