// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.parser;

import com.vladium.jcd.cls.ClassDef;
import com.vladium.jcd.cls.Field_info;
import com.vladium.jcd.cls.IAttributeCollection;
import com.vladium.jcd.cls.IConstantCollection;
import com.vladium.jcd.cls.IFieldCollection;
import com.vladium.jcd.cls.IInterfaceCollection;
import com.vladium.jcd.cls.IMethodCollection;
import com.vladium.jcd.cls.Method_info;
import com.vladium.jcd.cls.attribute.Attribute_info;
import com.vladium.jcd.cls.attribute.ConstantValueAttribute_info;
import com.vladium.jcd.cls.constant.CONSTANT_Double_info;
import com.vladium.jcd.cls.constant.CONSTANT_Long_info;
import com.vladium.jcd.cls.constant.CONSTANT_info;
import com.vladium.jcd.lib.UDataInputStream;
import com.vladium.util.ByteArrayIStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class ClassDefParser
{
    private static final class classParser
    {

        private static final boolean DEBUG = false;
        private static final String s_line = "------------------------------------------------------------------------";
        private final UDataInputStream m_bytes;
        private ClassDef m_table;

        void access_flags()
            throws IOException
        {
            int i = m_bytes.readU2();
            m_table.setAccessFlags(i);
        }

        void attributes()
            throws IOException
        {
            int j = m_bytes.readU2();
            IConstantCollection iconstantcollection = m_table.getConstants();
            for (int i = 0; i < j; i++)
            {
                Attribute_info attribute_info = Attribute_info.new_Attribute_info(iconstantcollection, m_bytes);
                m_table.getAttributes().add(attribute_info);
            }

        }

        ClassDef class_table()
            throws IOException
        {
            m_table = new ClassDef();
            magic();
            version();
            constant_pool();
            access_flags();
            this_class();
            super_class();
            interfaces();
            fields();
            methods();
            attributes();
            return m_table;
        }

        void constant_pool()
            throws IOException
        {
            int k = m_bytes.readU2();
            IConstantCollection iconstantcollection = m_table.getConstants();
            int j;
            for (int i = 1; i < k; i = j + 1)
            {
                CONSTANT_info constant_info = CONSTANT_info.new_CONSTANT_info(m_bytes);
                iconstantcollection.add(constant_info);
                if (!(constant_info instanceof CONSTANT_Long_info))
                {
                    j = i;
                    if (!(constant_info instanceof CONSTANT_Double_info))
                    {
                        continue;
                    }
                }
                j = i + 1;
            }

        }

        void fields()
            throws IOException
        {
            int k = m_bytes.readU2();
            IConstantCollection iconstantcollection = m_table.getConstants();
            for (int i = 0; i < k; i++)
            {
                Object obj = new Field_info(iconstantcollection, m_bytes);
                m_table.getFields().add(((Field_info) (obj)));
                if ((((Field_info) (obj)).getAccessFlags() & 0x18) != 24 || !"serialVersionUID".equals(((Field_info) (obj)).getName(m_table)))
                {
                    continue;
                }
                obj = ((Field_info) (obj)).getAttributes();
                int j = 0;
                for (int l = ((IAttributeCollection) (obj)).size(); j < l; j++)
                {
                    Object obj1 = ((IAttributeCollection) (obj)).get(j);
                    if (!(obj1 instanceof ConstantValueAttribute_info))
                    {
                        continue;
                    }
                    obj1 = ((ConstantValueAttribute_info)obj1).getValue(m_table);
                    if (obj1 instanceof CONSTANT_Long_info)
                    {
                        m_table.setDeclaredSUID(((CONSTANT_Long_info)obj1).m_value);
                    }
                }

            }

        }

        void interfaces()
            throws IOException
        {
            int j = m_bytes.readU2();
            for (int i = 0; i < j; i++)
            {
                int k = m_bytes.readU2();
                m_table.getInterfaces().add(k);
            }

        }

        void magic()
            throws IOException
        {
            long l = m_bytes.readU4();
            m_table.setMagic(l);
        }

        void methods()
            throws IOException
        {
            int j = m_bytes.readU2();
            IConstantCollection iconstantcollection = m_table.getConstants();
            for (int i = 0; i < j; i++)
            {
                Method_info method_info = new Method_info(iconstantcollection, m_bytes);
                m_table.getMethods().add(method_info);
            }

        }

        void super_class()
            throws IOException
        {
            int i = m_bytes.readU2();
            m_table.setSuperClassIndex(i);
        }

        void this_class()
            throws IOException
        {
            int i = m_bytes.readU2();
            m_table.setThisClassIndex(i);
        }

        void version()
            throws IOException
        {
            int i = m_bytes.readU2();
            int j = m_bytes.readU2();
            m_table.setVersion(new int[] {
                j, i
            });
        }

        classParser(UDataInputStream udatainputstream)
        {
            m_bytes = udatainputstream;
        }
    }


    static final boolean PARSE_SERIAL_VERSION_UID = true;
    static final int SERIAL_VERSION_UID_FIELD_MASK = 24;
    static final String SERIAL_VERSION_UID_FIELD_NAME = "serialVersionUID";

    public ClassDefParser()
    {
    }

    public static ClassDef parseClass(InputStream inputstream)
        throws IOException
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("null input: bytes");
        } else
        {
            return (new classParser(new UDataInputStream(inputstream))).class_table();
        }
    }

    public static ClassDef parseClass(byte abyte0[])
        throws IOException
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("null input: bytes");
        } else
        {
            return (new classParser(new UDataInputStream(new ByteArrayIStream(abyte0)))).class_table();
        }
    }

    public static ClassDef parseClass(byte abyte0[], int i)
        throws IOException
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("null input: bytes");
        } else
        {
            return (new classParser(new UDataInputStream(new ByteArrayIStream(abyte0, i)))).class_table();
        }
    }
}
