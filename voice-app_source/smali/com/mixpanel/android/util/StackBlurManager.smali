.class public Lcom/mixpanel/android/util/StackBlurManager;
.super Ljava/lang/Object;
.source "StackBlurManager.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static process(Landroid/graphics/Bitmap;I)V
    .locals 42
    .param p0, "source"    # Landroid/graphics/Bitmap;
    .param p1, "radius"    # I

    .prologue
    .line 35
    const/4 v2, 0x1

    move/from16 v0, p1

    if-ge v0, v2, :cond_0

    .line 225
    :goto_0
    return-void

    .line 38
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v5

    .line 39
    .local v5, "width":I
    invoke-virtual/range {p0 .. p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v9

    .line 40
    .local v9, "height":I
    mul-int v2, v5, v9

    new-array v3, v2, [I

    .line 41
    .local v3, "currentPixels":[I
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p0

    move v8, v5

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V

    .line 43
    add-int/lit8 v36, v5, -0x1

    .line 44
    .local v36, "wm":I
    add-int/lit8 v21, v9, -0x1

    .line 45
    .local v21, "hm":I
    mul-int v35, v5, v9

    .line 46
    .local v35, "wh":I
    add-int v2, p1, p1

    add-int/lit8 v14, v2, 0x1

    .line 48
    .local v14, "div":I
    move/from16 v0, v35

    new-array v0, v0, [I

    move-object/from16 v24, v0

    .line 49
    .local v24, "r":[I
    move/from16 v0, v35

    new-array v0, v0, [I

    move-object/from16 v17, v0

    .line 50
    .local v17, "g":[I
    move/from16 v0, v35

    new-array v10, v0, [I

    .line 52
    .local v10, "b":[I
    invoke-static {v5, v9}, Ljava/lang/Math;->max(II)I

    move-result v2

    new-array v0, v2, [I

    move-object/from16 v34, v0

    .line 54
    .local v34, "vmin":[I
    add-int/lit8 v2, v14, 0x1

    shr-int/lit8 v15, v2, 0x1

    .line 55
    .local v15, "divsum":I
    mul-int/2addr v15, v15

    .line 56
    mul-int/lit16 v2, v15, 0x100

    new-array v0, v2, [I

    move-object/from16 v16, v0

    .line 57
    .local v16, "dv":[I
    const/16 v22, 0x0

    .local v22, "i":I
    :goto_1
    mul-int/lit16 v2, v15, 0x100

    move/from16 v0, v22

    if-lt v0, v2, :cond_1

    .line 61
    const/16 v41, 0x0

    .line 62
    .local v41, "yw":I
    const/16 v39, 0x0

    .line 64
    .local v39, "yi":I
    const/4 v2, 0x3

    filled-new-array {v14, v2}, [I

    move-result-object v2

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v4, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v31

    check-cast v31, [[I

    .line 69
    .local v31, "stack":[[I
    add-int/lit8 v25, p1, 0x1

    .line 73
    .local v25, "r1":I
    const/16 v38, 0x0

    .local v38, "y":I
    :goto_2
    move/from16 v0, v38

    if-lt v0, v9, :cond_2

    .line 145
    const/16 v37, 0x0

    .local v37, "x":I
    :goto_3
    move/from16 v0, v37

    if-lt v0, v5, :cond_7

    .line 224
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v2, p0

    move v8, v5

    invoke-virtual/range {v2 .. v9}, Landroid/graphics/Bitmap;->setPixels([IIIIIII)V

    goto :goto_0

    .line 58
    .end local v25    # "r1":I
    .end local v31    # "stack":[[I
    .end local v37    # "x":I
    .end local v38    # "y":I
    .end local v39    # "yi":I
    .end local v41    # "yw":I
    :cond_1
    div-int v2, v22, v15

    aput v2, v16, v22

    .line 57
    add-int/lit8 v22, v22, 0x1

    goto :goto_1

    .line 74
    .restart local v25    # "r1":I
    .restart local v31    # "stack":[[I
    .restart local v38    # "y":I
    .restart local v39    # "yi":I
    .restart local v41    # "yw":I
    :cond_2
    const/4 v13, 0x0

    .local v13, "bsum":I
    move/from16 v20, v13

    .local v20, "gsum":I
    move/from16 v29, v13

    .local v29, "rsum":I
    move v12, v13

    .local v12, "boutsum":I
    move/from16 v19, v13

    .local v19, "goutsum":I
    move/from16 v28, v13

    .local v28, "routsum":I
    move v11, v13

    .local v11, "binsum":I
    move/from16 v18, v13

    .local v18, "ginsum":I
    move/from16 v27, v13

    .line 75
    .local v27, "rinsum":I
    move/from16 v0, p1

    neg-int v0, v0

    move/from16 v22, v0

    :goto_4
    move/from16 v0, v22

    move/from16 v1, p1

    if-le v0, v1, :cond_3

    .line 95
    move/from16 v32, p1

    .line 97
    .local v32, "stackpointer":I
    const/16 v37, 0x0

    .restart local v37    # "x":I
    :goto_5
    move/from16 v0, v37

    if-lt v0, v5, :cond_5

    .line 143
    add-int v41, v41, v5

    .line 73
    add-int/lit8 v38, v38, 0x1

    goto :goto_2

    .line 76
    .end local v32    # "stackpointer":I
    .end local v37    # "x":I
    :cond_3
    const/4 v2, 0x0

    move/from16 v0, v22

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    move/from16 v0, v36

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    add-int v2, v2, v39

    aget v23, v3, v2

    .line 77
    .local v23, "p":I
    add-int v2, v22, p1

    aget-object v30, v31, v2

    .line 78
    .local v30, "sir":[I
    const/4 v2, 0x0

    const/high16 v4, 0xff0000

    and-int v4, v4, v23

    shr-int/lit8 v4, v4, 0x10

    aput v4, v30, v2

    .line 79
    const/4 v2, 0x1

    const v4, 0xff00

    and-int v4, v4, v23

    shr-int/lit8 v4, v4, 0x8

    aput v4, v30, v2

    .line 80
    const/4 v2, 0x2

    move/from16 v0, v23

    and-int/lit16 v4, v0, 0xff

    aput v4, v30, v2

    .line 81
    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(I)I

    move-result v2

    sub-int v26, v25, v2

    .line 82
    .local v26, "rbs":I
    const/4 v2, 0x0

    aget v2, v30, v2

    mul-int v2, v2, v26

    add-int v29, v29, v2

    .line 83
    const/4 v2, 0x1

    aget v2, v30, v2

    mul-int v2, v2, v26

    add-int v20, v20, v2

    .line 84
    const/4 v2, 0x2

    aget v2, v30, v2

    mul-int v2, v2, v26

    add-int/2addr v13, v2

    .line 85
    if-lez v22, :cond_4

    .line 86
    const/4 v2, 0x0

    aget v2, v30, v2

    add-int v27, v27, v2

    .line 87
    const/4 v2, 0x1

    aget v2, v30, v2

    add-int v18, v18, v2

    .line 88
    const/4 v2, 0x2

    aget v2, v30, v2

    add-int/2addr v11, v2

    .line 75
    :goto_6
    add-int/lit8 v22, v22, 0x1

    goto :goto_4

    .line 90
    :cond_4
    const/4 v2, 0x0

    aget v2, v30, v2

    add-int v28, v28, v2

    .line 91
    const/4 v2, 0x1

    aget v2, v30, v2

    add-int v19, v19, v2

    .line 92
    const/4 v2, 0x2

    aget v2, v30, v2

    add-int/2addr v12, v2

    goto :goto_6

    .line 98
    .end local v23    # "p":I
    .end local v26    # "rbs":I
    .end local v30    # "sir":[I
    .restart local v32    # "stackpointer":I
    .restart local v37    # "x":I
    :cond_5
    aget v2, v16, v29

    aput v2, v24, v39

    .line 99
    aget v2, v16, v20

    aput v2, v17, v39

    .line 100
    aget v2, v16, v13

    aput v2, v10, v39

    .line 102
    sub-int v29, v29, v28

    .line 103
    sub-int v20, v20, v19

    .line 104
    sub-int/2addr v13, v12

    .line 106
    sub-int v2, v32, p1

    add-int v33, v2, v14

    .line 107
    .local v33, "stackstart":I
    rem-int v2, v33, v14

    aget-object v30, v31, v2

    .line 109
    .restart local v30    # "sir":[I
    const/4 v2, 0x0

    aget v2, v30, v2

    sub-int v28, v28, v2

    .line 110
    const/4 v2, 0x1

    aget v2, v30, v2

    sub-int v19, v19, v2

    .line 111
    const/4 v2, 0x2

    aget v2, v30, v2

    sub-int/2addr v12, v2

    .line 113
    if-nez v38, :cond_6

    .line 114
    add-int v2, v37, p1

    add-int/lit8 v2, v2, 0x1

    move/from16 v0, v36

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    aput v2, v34, v37

    .line 116
    :cond_6
    aget v2, v34, v37

    add-int v2, v2, v41

    aget v23, v3, v2

    .line 118
    .restart local v23    # "p":I
    const/4 v2, 0x0

    const/high16 v4, 0xff0000

    and-int v4, v4, v23

    shr-int/lit8 v4, v4, 0x10

    aput v4, v30, v2

    .line 119
    const/4 v2, 0x1

    const v4, 0xff00

    and-int v4, v4, v23

    shr-int/lit8 v4, v4, 0x8

    aput v4, v30, v2

    .line 120
    const/4 v2, 0x2

    move/from16 v0, v23

    and-int/lit16 v4, v0, 0xff

    aput v4, v30, v2

    .line 122
    const/4 v2, 0x0

    aget v2, v30, v2

    add-int v27, v27, v2

    .line 123
    const/4 v2, 0x1

    aget v2, v30, v2

    add-int v18, v18, v2

    .line 124
    const/4 v2, 0x2

    aget v2, v30, v2

    add-int/2addr v11, v2

    .line 126
    add-int v29, v29, v27

    .line 127
    add-int v20, v20, v18

    .line 128
    add-int/2addr v13, v11

    .line 130
    add-int/lit8 v2, v32, 0x1

    rem-int v32, v2, v14

    .line 131
    rem-int v2, v32, v14

    aget-object v30, v31, v2

    .line 133
    const/4 v2, 0x0

    aget v2, v30, v2

    add-int v28, v28, v2

    .line 134
    const/4 v2, 0x1

    aget v2, v30, v2

    add-int v19, v19, v2

    .line 135
    const/4 v2, 0x2

    aget v2, v30, v2

    add-int/2addr v12, v2

    .line 137
    const/4 v2, 0x0

    aget v2, v30, v2

    sub-int v27, v27, v2

    .line 138
    const/4 v2, 0x1

    aget v2, v30, v2

    sub-int v18, v18, v2

    .line 139
    const/4 v2, 0x2

    aget v2, v30, v2

    sub-int/2addr v11, v2

    .line 141
    add-int/lit8 v39, v39, 0x1

    .line 97
    add-int/lit8 v37, v37, 0x1

    goto/16 :goto_5

    .line 146
    .end local v11    # "binsum":I
    .end local v12    # "boutsum":I
    .end local v13    # "bsum":I
    .end local v18    # "ginsum":I
    .end local v19    # "goutsum":I
    .end local v20    # "gsum":I
    .end local v23    # "p":I
    .end local v27    # "rinsum":I
    .end local v28    # "routsum":I
    .end local v29    # "rsum":I
    .end local v30    # "sir":[I
    .end local v32    # "stackpointer":I
    .end local v33    # "stackstart":I
    :cond_7
    const/4 v13, 0x0

    .restart local v13    # "bsum":I
    move/from16 v20, v13

    .restart local v20    # "gsum":I
    move/from16 v29, v13

    .restart local v29    # "rsum":I
    move v12, v13

    .restart local v12    # "boutsum":I
    move/from16 v19, v13

    .restart local v19    # "goutsum":I
    move/from16 v28, v13

    .restart local v28    # "routsum":I
    move v11, v13

    .restart local v11    # "binsum":I
    move/from16 v18, v13

    .restart local v18    # "ginsum":I
    move/from16 v27, v13

    .line 147
    .restart local v27    # "rinsum":I
    move/from16 v0, p1

    neg-int v2, v0

    mul-int v40, v2, v5

    .line 148
    .local v40, "yp":I
    move/from16 v0, p1

    neg-int v0, v0

    move/from16 v22, v0

    :goto_7
    move/from16 v0, v22

    move/from16 v1, p1

    if-le v0, v1, :cond_8

    .line 177
    move/from16 v39, v37

    .line 178
    move/from16 v32, p1

    .line 179
    .restart local v32    # "stackpointer":I
    const/16 v38, 0x0

    :goto_8
    move/from16 v0, v38

    if-lt v0, v9, :cond_b

    .line 145
    add-int/lit8 v37, v37, 0x1

    goto/16 :goto_3

    .line 149
    .end local v32    # "stackpointer":I
    :cond_8
    const/4 v2, 0x0

    move/from16 v0, v40

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int v39, v2, v37

    .line 151
    add-int v2, v22, p1

    aget-object v30, v31, v2

    .line 153
    .restart local v30    # "sir":[I
    const/4 v2, 0x0

    aget v4, v24, v39

    aput v4, v30, v2

    .line 154
    const/4 v2, 0x1

    aget v4, v17, v39

    aput v4, v30, v2

    .line 155
    const/4 v2, 0x2

    aget v4, v10, v39

    aput v4, v30, v2

    .line 157
    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(I)I

    move-result v2

    sub-int v26, v25, v2

    .line 159
    .restart local v26    # "rbs":I
    aget v2, v24, v39

    mul-int v2, v2, v26

    add-int v29, v29, v2

    .line 160
    aget v2, v17, v39

    mul-int v2, v2, v26

    add-int v20, v20, v2

    .line 161
    aget v2, v10, v39

    mul-int v2, v2, v26

    add-int/2addr v13, v2

    .line 163
    if-lez v22, :cond_a

    .line 164
    const/4 v2, 0x0

    aget v2, v30, v2

    add-int v27, v27, v2

    .line 165
    const/4 v2, 0x1

    aget v2, v30, v2

    add-int v18, v18, v2

    .line 166
    const/4 v2, 0x2

    aget v2, v30, v2

    add-int/2addr v11, v2

    .line 173
    :goto_9
    move/from16 v0, v22

    move/from16 v1, v21

    if-ge v0, v1, :cond_9

    .line 174
    add-int v40, v40, v5

    .line 148
    :cond_9
    add-int/lit8 v22, v22, 0x1

    goto :goto_7

    .line 168
    :cond_a
    const/4 v2, 0x0

    aget v2, v30, v2

    add-int v28, v28, v2

    .line 169
    const/4 v2, 0x1

    aget v2, v30, v2

    add-int v19, v19, v2

    .line 170
    const/4 v2, 0x2

    aget v2, v30, v2

    add-int/2addr v12, v2

    goto :goto_9

    .line 180
    .end local v26    # "rbs":I
    .end local v30    # "sir":[I
    .restart local v32    # "stackpointer":I
    :cond_b
    const/high16 v2, -0x1000000

    aget v4, v16, v29

    shl-int/lit8 v4, v4, 0x10

    or-int/2addr v2, v4

    aget v4, v16, v20

    shl-int/lit8 v4, v4, 0x8

    or-int/2addr v2, v4

    aget v4, v16, v13

    or-int/2addr v2, v4

    aput v2, v3, v39

    .line 182
    sub-int v29, v29, v28

    .line 183
    sub-int v20, v20, v19

    .line 184
    sub-int/2addr v13, v12

    .line 186
    sub-int v2, v32, p1

    add-int v33, v2, v14

    .line 187
    .restart local v33    # "stackstart":I
    rem-int v2, v33, v14

    aget-object v30, v31, v2

    .line 189
    .restart local v30    # "sir":[I
    const/4 v2, 0x0

    aget v2, v30, v2

    sub-int v28, v28, v2

    .line 190
    const/4 v2, 0x1

    aget v2, v30, v2

    sub-int v19, v19, v2

    .line 191
    const/4 v2, 0x2

    aget v2, v30, v2

    sub-int/2addr v12, v2

    .line 193
    if-nez v37, :cond_c

    .line 194
    add-int v2, v38, v25

    move/from16 v0, v21

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    mul-int/2addr v2, v5

    aput v2, v34, v38

    .line 196
    :cond_c
    aget v2, v34, v38

    add-int v23, v37, v2

    .line 198
    .restart local v23    # "p":I
    const/4 v2, 0x0

    aget v4, v24, v23

    aput v4, v30, v2

    .line 199
    const/4 v2, 0x1

    aget v4, v17, v23

    aput v4, v30, v2

    .line 200
    const/4 v2, 0x2

    aget v4, v10, v23

    aput v4, v30, v2

    .line 202
    const/4 v2, 0x0

    aget v2, v30, v2

    add-int v27, v27, v2

    .line 203
    const/4 v2, 0x1

    aget v2, v30, v2

    add-int v18, v18, v2

    .line 204
    const/4 v2, 0x2

    aget v2, v30, v2

    add-int/2addr v11, v2

    .line 206
    add-int v29, v29, v27

    .line 207
    add-int v20, v20, v18

    .line 208
    add-int/2addr v13, v11

    .line 210
    add-int/lit8 v2, v32, 0x1

    rem-int v32, v2, v14

    .line 211
    aget-object v30, v31, v32

    .line 213
    const/4 v2, 0x0

    aget v2, v30, v2

    add-int v28, v28, v2

    .line 214
    const/4 v2, 0x1

    aget v2, v30, v2

    add-int v19, v19, v2

    .line 215
    const/4 v2, 0x2

    aget v2, v30, v2

    add-int/2addr v12, v2

    .line 217
    const/4 v2, 0x0

    aget v2, v30, v2

    sub-int v27, v27, v2

    .line 218
    const/4 v2, 0x1

    aget v2, v30, v2

    sub-int v18, v18, v2

    .line 219
    const/4 v2, 0x2

    aget v2, v30, v2

    sub-int/2addr v11, v2

    .line 221
    add-int v39, v39, v5

    .line 179
    add-int/lit8 v38, v38, 0x1

    goto/16 :goto_8
.end method
