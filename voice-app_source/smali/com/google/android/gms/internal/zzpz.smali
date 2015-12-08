.class final Lcom/google/android/gms/internal/zzpz;
.super Ljava/lang/Object;


# direct methods
.method static zza(ILorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)Lcom/google/android/gms/internal/zzag$zza;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lorg/json/JSONArray;",
            "[",
            "Lcom/google/android/gms/internal/zzag$zza;",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/google/android/gms/internal/zzag$zza;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzqf$zzg;,
            Lorg/json/JSONException;
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v7, 0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Value cycle detected. Current value reference: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "  Previous value references: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpz;->zzeT(Ljava/lang/String;)V

    :cond_0
    const-string v0, "values"

    invoke-static {p1, p0, v0}, Lcom/google/android/gms/internal/zzpz;->zza(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    aget-object v2, p2, p0

    if-eqz v2, :cond_1

    aget-object v0, p2, p0

    :goto_0
    return-object v0

    :cond_1
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v3, Lcom/google/android/gms/internal/zzag$zza;

    invoke-direct {v3}, Lcom/google/android/gms/internal/zzag$zza;-><init>()V

    instance-of v2, v0, Lorg/json/JSONArray;

    if-eqz v2, :cond_2

    check-cast v0, Lorg/json/JSONArray;

    const/4 v2, 0x2

    iput v2, v3, Lcom/google/android/gms/internal/zzag$zza;->type:I

    iput-boolean v7, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjb:Z

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/internal/zzag$zza;

    iput-object v2, v3, Lcom/google/android/gms/internal/zzag$zza;->zziS:[Lcom/google/android/gms/internal/zzag$zza;

    :goto_1
    iget-object v2, v3, Lcom/google/android/gms/internal/zzag$zza;->zziS:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v2, v2

    if-ge v1, v2, :cond_4

    iget-object v2, v3, Lcom/google/android/gms/internal/zzag$zza;->zziS:[Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v4

    invoke-static {v4, p1, p2, p3}, Lcom/google/android/gms/internal/zzpz;->zza(ILorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v4

    aput-object v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    instance-of v2, v0, Lorg/json/JSONObject;

    if-eqz v2, :cond_8

    check-cast v0, Lorg/json/JSONObject;

    const-string v2, "escaping"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v2

    new-array v2, v2, [I

    iput-object v2, v3, Lcom/google/android/gms/internal/zzag$zza;->zzja:[I

    move v2, v1

    :goto_2
    iget-object v5, v3, Lcom/google/android/gms/internal/zzag$zza;->zzja:[I

    array-length v5, v5

    if-ge v2, v5, :cond_3

    iget-object v5, v3, Lcom/google/android/gms/internal/zzag$zza;->zzja:[I

    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v6

    aput v6, v5, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    const-string v2, "function_id"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v1, 0x5

    iput v1, v3, Lcom/google/android/gms/internal/zzag$zza;->type:I

    const-string v1, "function_id"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zziW:Ljava/lang/String;

    :cond_4
    :goto_3
    aput-object v3, p2, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-object v0, v3

    goto :goto_0

    :cond_5
    const-string v2, "macro_reference"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/4 v1, 0x4

    iput v1, v3, Lcom/google/android/gms/internal/zzag$zza;->type:I

    iput-boolean v7, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjb:Z

    const-string v1, "macro_reference"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0, p1, p2, p3}, Lcom/google/android/gms/internal/zzpz;->zza(ILorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/tagmanager/zzdf;->zzg(Lcom/google/android/gms/internal/zzag$zza;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zziV:Ljava/lang/String;

    goto :goto_3

    :cond_6
    const-string v2, "template_token"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, 0x7

    iput v2, v3, Lcom/google/android/gms/internal/zzag$zza;->type:I

    iput-boolean v7, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjb:Z

    const-string v2, "template_token"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/internal/zzag$zza;

    iput-object v2, v3, Lcom/google/android/gms/internal/zzag$zza;->zziZ:[Lcom/google/android/gms/internal/zzag$zza;

    :goto_4
    iget-object v2, v3, Lcom/google/android/gms/internal/zzag$zza;->zziZ:[Lcom/google/android/gms/internal/zzag$zza;

    array-length v2, v2

    if-ge v1, v2, :cond_4

    iget-object v2, v3, Lcom/google/android/gms/internal/zzag$zza;->zziZ:[Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v4

    invoke-static {v4, p1, p2, p3}, Lcom/google/android/gms/internal/zzpz;->zza(ILorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v4

    aput-object v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_7
    const/4 v2, 0x3

    iput v2, v3, Lcom/google/android/gms/internal/zzag$zza;->type:I

    iput-boolean v7, v3, Lcom/google/android/gms/internal/zzag$zza;->zzjb:Z

    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    move-result v2

    new-array v4, v2, [Lcom/google/android/gms/internal/zzag$zza;

    iput-object v4, v3, Lcom/google/android/gms/internal/zzag$zza;->zziT:[Lcom/google/android/gms/internal/zzag$zza;

    new-array v2, v2, [Lcom/google/android/gms/internal/zzag$zza;

    iput-object v2, v3, Lcom/google/android/gms/internal/zzag$zza;->zziU:[Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v4

    move v2, v1

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v5, v3, Lcom/google/android/gms/internal/zzag$zza;->zziT:[Lcom/google/android/gms/internal/zzag$zza;

    new-instance v6, Ljava/lang/Integer;

    invoke-direct {v6, v1}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6, p1, p2, p3}, Lcom/google/android/gms/internal/zzpz;->zza(ILorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v6

    aput-object v6, v5, v2

    iget-object v5, v3, Lcom/google/android/gms/internal/zzag$zza;->zziU:[Lcom/google/android/gms/internal/zzag$zza;

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1, p1, p2, p3}, Lcom/google/android/gms/internal/zzpz;->zza(ILorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v1

    aput-object v1, v5, v2

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_5

    :cond_8
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_9

    check-cast v0, Ljava/lang/String;

    iput-object v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zziR:Ljava/lang/String;

    iput v7, v3, Lcom/google/android/gms/internal/zzag$zza;->type:I

    goto/16 :goto_3

    :cond_9
    instance-of v1, v0, Ljava/lang/Boolean;

    if-eqz v1, :cond_a

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zziY:Z

    const/16 v0, 0x8

    iput v0, v3, Lcom/google/android/gms/internal/zzag$zza;->type:I

    goto/16 :goto_3

    :cond_a
    instance-of v1, v0, Ljava/lang/Integer;

    if-eqz v1, :cond_b

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v0, v0

    iput-wide v0, v3, Lcom/google/android/gms/internal/zzag$zza;->zziX:J

    const/4 v0, 0x6

    iput v0, v3, Lcom/google/android/gms/internal/zzag$zza;->type:I

    goto/16 :goto_3

    :cond_b
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid value type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpz;->zzeT(Ljava/lang/String;)V

    goto/16 :goto_3
.end method

.method static zza(Lorg/json/JSONObject;Lorg/json/JSONArray;Lorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;I)Lcom/google/android/gms/internal/zzqf$zza;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzqf$zzg;,
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzqf$zza;->zzAm()Lcom/google/android/gms/internal/zzqf$zzb;

    move-result-object v3

    const-string v0, "property"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge v2, v0, :cond_1

    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v0

    const-string v1, "properties"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/zzpz;->zza(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    const-string v1, "key"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    const-string v5, "key"

    invoke-static {p2, v1, v5}, Lcom/google/android/gms/internal/zzpz;->zza(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v5, "value"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    const-string v5, "value"

    invoke-static {p3, v0, v5}, Lcom/google/android/gms/internal/zzpz;->zza([Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/zzag$zza;

    sget-object v5, Lcom/google/android/gms/internal/zzae;->zzgs:Lcom/google/android/gms/internal/zzae;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/zzae;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/zzqf$zzb;->zzq(Lcom/google/android/gms/internal/zzag$zza;)Lcom/google/android/gms/internal/zzqf$zzb;

    :goto_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v1, v0}, Lcom/google/android/gms/internal/zzqf$zzb;->zzb(Ljava/lang/String;Lcom/google/android/gms/internal/zzag$zza;)Lcom/google/android/gms/internal/zzqf$zzb;

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzqf$zzb;->zzAo()Lcom/google/android/gms/internal/zzqf$zza;

    move-result-object v0

    return-object v0
.end method

.method static zza(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;Ljava/util/List;[Lcom/google/android/gms/internal/zzag$zza;)Lcom/google/android/gms/internal/zzqf$zze;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzqf$zza;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzqf$zza;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzqf$zza;",
            ">;[",
            "Lcom/google/android/gms/internal/zzag$zza;",
            ")",
            "Lcom/google/android/gms/internal/zzqf$zze;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/zzqf$zze;->zzAt()Lcom/google/android/gms/internal/zzqf$zzf;

    move-result-object v3

    const-string v1, "positive_predicate"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    const-string v1, "negative_predicate"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    const-string v1, "add_tag"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    const-string v1, "remove_tag"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    const-string v1, "add_tag_rule_name"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    const-string v1, "remove_tag_rule_name"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v9

    const-string v1, "add_macro"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v10

    const-string v1, "remove_macro"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    const-string v1, "add_macro_rule_name"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    const-string v1, "remove_macro_rule_name"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v13

    if-eqz v4, :cond_0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v2, v1, :cond_0

    invoke-virtual {v4, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    move-object/from16 v0, p3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzqf$zza;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzqf$zzf;->zzd(Lcom/google/android/gms/internal/zzqf$zza;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    :cond_0
    if-eqz v5, :cond_1

    const/4 v1, 0x0

    move v2, v1

    :goto_1
    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v2, v1, :cond_1

    invoke-virtual {v5, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    move-object/from16 v0, p3

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzqf$zza;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzqf$zzf;->zze(Lcom/google/android/gms/internal/zzqf$zza;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    const/4 v1, 0x0

    move v2, v1

    :goto_2
    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v2, v1, :cond_2

    invoke-virtual {v6, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzqf$zza;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzqf$zzf;->zzf(Lcom/google/android/gms/internal/zzqf$zza;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_2

    :cond_2
    if-eqz v7, :cond_3

    const/4 v1, 0x0

    move v2, v1

    :goto_3
    invoke-virtual {v7}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v2, v1, :cond_3

    invoke-virtual {v7, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzqf$zza;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzqf$zzf;->zzg(Lcom/google/android/gms/internal/zzqf$zza;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_3

    :cond_3
    if-eqz v8, :cond_4

    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v8}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_4

    invoke-virtual {v8, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v2

    aget-object v2, p4, v2

    iget-object v2, v2, Lcom/google/android/gms/internal/zzag$zza;->zziR:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zzqf$zzf;->zzeW(Ljava/lang/String;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_4
    if-eqz v9, :cond_5

    const/4 v1, 0x0

    :goto_5
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_5

    invoke-virtual {v9, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v2

    aget-object v2, p4, v2

    iget-object v2, v2, Lcom/google/android/gms/internal/zzag$zza;->zziR:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zzqf$zzf;->zzeX(Ljava/lang/String;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_5
    if-eqz v10, :cond_6

    const/4 v1, 0x0

    move v2, v1

    :goto_6
    invoke-virtual {v10}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v2, v1, :cond_6

    invoke-virtual {v10, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzqf$zza;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzqf$zzf;->zzh(Lcom/google/android/gms/internal/zzqf$zza;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_6

    :cond_6
    if-eqz v11, :cond_7

    const/4 v1, 0x0

    move v2, v1

    :goto_7
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v2, v1, :cond_7

    invoke-virtual {v11, v2}, Lorg/json/JSONArray;->getInt(I)I

    move-result v1

    move-object/from16 v0, p2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzqf$zza;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzqf$zzf;->zzi(Lcom/google/android/gms/internal/zzqf$zza;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_7

    :cond_7
    if-eqz v12, :cond_8

    const/4 v1, 0x0

    :goto_8
    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_8

    invoke-virtual {v12, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v2

    aget-object v2, p4, v2

    iget-object v2, v2, Lcom/google/android/gms/internal/zzag$zza;->zziR:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zzqf$zzf;->zzeY(Ljava/lang/String;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_8
    if-eqz v13, :cond_9

    const/4 v1, 0x0

    :goto_9
    invoke-virtual {v13}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_9

    invoke-virtual {v13, v1}, Lorg/json/JSONArray;->getInt(I)I

    move-result v2

    aget-object v2, p4, v2

    iget-object v2, v2, Lcom/google/android/gms/internal/zzag$zza;->zziR:Ljava/lang/String;

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/zzqf$zzf;->zzeZ(Ljava/lang/String;)Lcom/google/android/gms/internal/zzqf$zzf;

    add-int/lit8 v1, v1, 0x1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzqf$zzf;->zzAE()Lcom/google/android/gms/internal/zzqf$zze;

    move-result-object v1

    return-object v1
.end method

.method private static zza(Lorg/json/JSONArray;ILjava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/json/JSONArray;",
            "I",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzqf$zzg;
        }
    .end annotation

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    :try_start_0
    invoke-virtual {p0, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index out of bounds detected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpz;->zzeT(Ljava/lang/String;)V

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static zza([Ljava/lang/Object;ILjava/lang/String;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;I",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzqf$zzg;
        }
    .end annotation

    if-ltz p1, :cond_0

    array-length v0, p0

    if-lt p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Index out of bounds detected: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpz;->zzeT(Ljava/lang/String;)V

    :cond_1
    aget-object v0, p0, p1

    return-object v0
.end method

.method static zza(Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Lorg/json/JSONArray;",
            "Lorg/json/JSONArray;",
            "[",
            "Lcom/google/android/gms/internal/zzag$zza;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/zzqf$zza;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/google/android/gms/internal/zzqf$zzg;
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    invoke-static {v2, p1, p2, p3, v0}, Lcom/google/android/gms/internal/zzpz;->zza(Lorg/json/JSONObject;Lorg/json/JSONArray;Lorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;I)Lcom/google/android/gms/internal/zzqf$zza;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private static zzeT(Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/zzqf$zzg;
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/tagmanager/zzbg;->zzaz(Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzqf$zzg;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/zzqf$zzg;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static zzey(Ljava/lang/String;)Lcom/google/android/gms/internal/zzqf$zzc;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/google/android/gms/internal/zzqf$zzg;
        }
    .end annotation

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "resource"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    check-cast v0, Lorg/json/JSONObject;

    invoke-static {}, Lcom/google/android/gms/internal/zzqf$zzc;->zzAp()Lcom/google/android/gms/internal/zzqf$zzd;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/internal/zzpz;->zzj(Lorg/json/JSONObject;)[Lcom/google/android/gms/internal/zzag$zza;

    move-result-object v4

    const-string v1, "properties"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const-string v5, "key"

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    const-string v6, "tags"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    invoke-static {v6, v1, v5, v4}, Lcom/google/android/gms/internal/zzpz;->zza(Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;)Ljava/util/List;

    move-result-object v6

    const-string v7, "predicates"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v7

    invoke-static {v7, v1, v5, v4}, Lcom/google/android/gms/internal/zzpz;->zza(Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;)Ljava/util/List;

    move-result-object v7

    const-string v8, "macros"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v8

    invoke-static {v8, v1, v5, v4}, Lcom/google/android/gms/internal/zzpz;->zza(Lorg/json/JSONArray;Lorg/json/JSONArray;Lorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/zzqf$zza;

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/zzqf$zzd;->zzc(Lcom/google/android/gms/internal/zzqf$zza;)Lcom/google/android/gms/internal/zzqf$zzd;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzqf$zzg;

    const-string v1, "Resource map not found"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzqf$zzg;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v1, "rules"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v8

    if-ge v0, v8, :cond_2

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    invoke-static {v8, v6, v5, v7, v4}, Lcom/google/android/gms/internal/zzpz;->zza(Lorg/json/JSONObject;Ljava/util/List;Ljava/util/List;Ljava/util/List;[Lcom/google/android/gms/internal/zzag$zza;)Lcom/google/android/gms/internal/zzqf$zze;

    move-result-object v8

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/zzqf$zzd;->zzb(Lcom/google/android/gms/internal/zzqf$zze;)Lcom/google/android/gms/internal/zzqf$zzd;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const-string v0, "1"

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/zzqf$zzd;->zzeV(Ljava/lang/String;)Lcom/google/android/gms/internal/zzqf$zzd;

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/zzqf$zzd;->zzjb(I)Lcom/google/android/gms/internal/zzqf$zzd;

    const-string v0, "runtime"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_3

    :cond_3
    invoke-virtual {v3}, Lcom/google/android/gms/internal/zzqf$zzd;->zzAs()Lcom/google/android/gms/internal/zzqf$zzc;

    move-result-object v0

    return-object v0
.end method

.method static zzj(Lorg/json/JSONObject;)[Lcom/google/android/gms/internal/zzag$zza;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Lcom/google/android/gms/internal/zzqf$zzg;
        }
    .end annotation

    const/4 v2, 0x0

    const-string v0, "values"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lorg/json/JSONArray;

    if-eqz v1, :cond_0

    check-cast v0, Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v1

    new-array v3, v1, [Lcom/google/android/gms/internal/zzag$zza;

    move v1, v2

    :goto_0
    array-length v4, v3

    if-ge v1, v4, :cond_1

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v2}, Ljava/util/HashSet;-><init>(I)V

    invoke-static {v1, v0, v3, v4}, Lcom/google/android/gms/internal/zzpz;->zza(ILorg/json/JSONArray;[Lcom/google/android/gms/internal/zzag$zza;Ljava/util/Set;)Lcom/google/android/gms/internal/zzag$zza;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/zzqf$zzg;

    const-string v1, "Missing Values list"

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/zzqf$zzg;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-object v3
.end method
