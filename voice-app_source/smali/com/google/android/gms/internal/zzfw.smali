.class public Lcom/google/android/gms/internal/zzfw;
.super Lcom/google/android/gms/internal/zzfs;


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzgd;
.end annotation


# instance fields
.field private zzBA:Lcom/google/android/gms/internal/zzdw;

.field protected zzBB:Lcom/google/android/gms/internal/zzec;

.field private zzoq:Lcom/google/android/gms/internal/zzef;

.field private zzxn:Lcom/google/android/gms/internal/zzdy;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/internal/zzft$zza;)V
    .locals 1

    invoke-direct {p0, p1, p2, p3, p5}, Lcom/google/android/gms/internal/zzfs;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/zzha$zza;Lcom/google/android/gms/internal/zzid;Lcom/google/android/gms/internal/zzft$zza;)V

    iput-object p4, p0, Lcom/google/android/gms/internal/zzfw;->zzoq:Lcom/google/android/gms/internal/zzef;

    iget-object v0, p2, Lcom/google/android/gms/internal/zzha$zza;->zzFm:Lcom/google/android/gms/internal/zzdy;

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfw;->zzxn:Lcom/google/android/gms/internal/zzdy;

    return-void
.end method


# virtual methods
.method public onStop()V
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfw;->zzBr:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-super {p0}, Lcom/google/android/gms/internal/zzfs;->onStop()V

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfw;->zzBA:Lcom/google/android/gms/internal/zzdw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfw;->zzBA:Lcom/google/android/gms/internal/zzdw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/zzdw;->cancel()V

    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method protected zzh(J)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzfs$zza;
        }
    .end annotation

    iget-object v1, p0, Lcom/google/android/gms/internal/zzfw;->zzBr:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v0, Lcom/google/android/gms/internal/zzdw;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfw;->mContext:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzfw;->zzBs:Lcom/google/android/gms/internal/zzha$zza;

    iget-object v3, v3, Lcom/google/android/gms/internal/zzha$zza;->zzFr:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzfw;->zzoq:Lcom/google/android/gms/internal/zzef;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzfw;->zzxn:Lcom/google/android/gms/internal/zzdy;

    invoke-direct {v0, v2, v3, v4, v5}, Lcom/google/android/gms/internal/zzdw;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;Lcom/google/android/gms/internal/zzef;Lcom/google/android/gms/internal/zzdy;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfw;->zzBA:Lcom/google/android/gms/internal/zzdw;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfw;->zzBA:Lcom/google/android/gms/internal/zzdw;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, p1, p2, v2, v3}, Lcom/google/android/gms/internal/zzdw;->zza(JJ)Lcom/google/android/gms/internal/zzec;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    iget-object v0, p0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    iget v0, v0, Lcom/google/android/gms/internal/zzec;->zzxY:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lcom/google/android/gms/internal/zzfs$zza;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mediation result: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    iget v2, v2, Lcom/google/android/gms/internal/zzec;->zzxY:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzfs$zza;-><init>(Ljava/lang/String;I)V

    throw v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :pswitch_0
    new-instance v0, Lcom/google/android/gms/internal/zzfs$zza;

    const-string v1, "No fill from any mediation ad networks."

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/zzfs$zza;-><init>(Ljava/lang/String;I)V

    throw v0

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected zzz(I)Lcom/google/android/gms/internal/zzha;
    .locals 32

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/google/android/gms/internal/zzfw;->zzBs:Lcom/google/android/gms/internal/zzha$zza;

    iget-object v6, v2, Lcom/google/android/gms/internal/zzha$zza;->zzFr:Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;

    new-instance v2, Lcom/google/android/gms/internal/zzha;

    iget-object v3, v6, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzCm:Lcom/google/android/gms/ads/internal/client/AdRequestParcel;

    move-object/from16 v0, p0

    iget-object v4, v0, Lcom/google/android/gms/internal/zzfw;->zzoA:Lcom/google/android/gms/internal/zzid;

    move-object/from16 v0, p0

    iget-object v5, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v5, v5, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzxF:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v7, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v7, v7, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzxG:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v8, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-object v8, v8, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCM:Ljava/util/List;

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget v9, v9, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->orientation:I

    move-object/from16 v0, p0

    iget-object v10, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-wide v10, v10, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzxJ:J

    iget-object v12, v6, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzCp:Ljava/lang/String;

    move-object/from16 v0, p0

    iget-object v13, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    iget-boolean v13, v13, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCK:Z

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    if-eqz v14, :cond_0

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    iget-object v14, v14, Lcom/google/android/gms/internal/zzec;->zzxZ:Lcom/google/android/gms/internal/zzdx;

    :goto_0
    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    if-eqz v15, :cond_1

    move-object/from16 v0, p0

    iget-object v15, v0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    iget-object v15, v15, Lcom/google/android/gms/internal/zzec;->zzya:Lcom/google/android/gms/internal/zzeg;

    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    move-object/from16 v16, v0

    if-eqz v16, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    iget-object v0, v0, Lcom/google/android/gms/internal/zzec;->zzyb:Ljava/lang/String;

    move-object/from16 v16, v0

    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzxn:Lcom/google/android/gms/internal/zzdy;

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    move-object/from16 v18, v0

    if-eqz v18, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBB:Lcom/google/android/gms/internal/zzec;

    move-object/from16 v18, v0

    move-object/from16 v0, v18

    iget-object v0, v0, Lcom/google/android/gms/internal/zzec;->zzyc:Lcom/google/android/gms/internal/zzea;

    move-object/from16 v18, v0

    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    iget-wide v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCL:J

    move-wide/from16 v19, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBs:Lcom/google/android/gms/internal/zzha$zza;

    move-object/from16 v21, v0

    move-object/from16 v0, v21

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha$zza;->zzpN:Lcom/google/android/gms/ads/internal/client/AdSizeParcel;

    move-object/from16 v21, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-object/from16 v22, v0

    move-object/from16 v0, v22

    iget-wide v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCJ:J

    move-wide/from16 v22, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBs:Lcom/google/android/gms/internal/zzha$zza;

    move-object/from16 v24, v0

    move-object/from16 v0, v24

    iget-wide v0, v0, Lcom/google/android/gms/internal/zzha$zza;->zzFo:J

    move-wide/from16 v24, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    iget-wide v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCO:J

    move-wide/from16 v26, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBt:Lcom/google/android/gms/ads/internal/request/AdResponseParcel;

    move-object/from16 v28, v0

    move-object/from16 v0, v28

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/request/AdResponseParcel;->zzCP:Ljava/lang/String;

    move-object/from16 v28, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/google/android/gms/internal/zzfw;->zzBs:Lcom/google/android/gms/internal/zzha$zza;

    move-object/from16 v29, v0

    move-object/from16 v0, v29

    iget-object v0, v0, Lcom/google/android/gms/internal/zzha$zza;->zzFl:Lorg/json/JSONObject;

    move-object/from16 v29, v0

    const/16 v30, 0x0

    iget-object v0, v6, Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;->zzCC:Ljava/lang/String;

    move-object/from16 v31, v0

    move/from16 v6, p1

    invoke-direct/range {v2 .. v31}, Lcom/google/android/gms/internal/zzha;-><init>(Lcom/google/android/gms/ads/internal/client/AdRequestParcel;Lcom/google/android/gms/internal/zzid;Ljava/util/List;ILjava/util/List;Ljava/util/List;IJLjava/lang/String;ZLcom/google/android/gms/internal/zzdx;Lcom/google/android/gms/internal/zzeg;Ljava/lang/String;Lcom/google/android/gms/internal/zzdy;Lcom/google/android/gms/internal/zzea;JLcom/google/android/gms/ads/internal/client/AdSizeParcel;JJJLjava/lang/String;Lorg/json/JSONObject;Lcom/google/android/gms/ads/internal/formats/zzg$zza;Ljava/lang/String;)V

    return-object v2

    :cond_0
    const/4 v14, 0x0

    goto/16 :goto_0

    :cond_1
    const/4 v15, 0x0

    goto/16 :goto_1

    :cond_2
    const-class v16, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v16

    goto/16 :goto_2

    :cond_3
    const/16 v18, 0x0

    goto :goto_3
.end method
