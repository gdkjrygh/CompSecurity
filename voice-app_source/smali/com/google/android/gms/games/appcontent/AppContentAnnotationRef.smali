.class public final Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;
.super Lcom/google/android/gms/games/appcontent/MultiDataBufferRef;

# interfaces
.implements Lcom/google/android/gms/games/appcontent/AppContentAnnotation;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;I)V
    .locals 1
    .param p2, "dataRow"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .local p1, "dataHolders":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/android/gms/common/data/DataHolder;>;"
    const/4 v0, 0x2

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/games/appcontent/MultiDataBufferRef;-><init>(Ljava/util/ArrayList;II)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    invoke-static {p0, p1}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationEntity;->zza(Lcom/google/android/gms/games/appcontent/AppContentAnnotation;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->zzrY()Lcom/google/android/gms/games/appcontent/AppContentAnnotation;

    move-result-object v0

    return-object v0
.end method

.method public getDescription()Ljava/lang/String;
    .locals 1

    const-string v0, "annotation_description"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "annotation_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    const-string v0, "annotation_title"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationEntity;->zza(Lcom/google/android/gms/games/appcontent/AppContentAnnotation;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationEntity;->zzb(Lcom/google/android/gms/games/appcontent/AppContentAnnotation;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->zzrY()Lcom/google/android/gms/games/appcontent/AppContentAnnotation;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/appcontent/AppContentAnnotationEntity;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationEntity;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzrS()Ljava/lang/String;
    .locals 1

    const-string v0, "annotation_image_default_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzrT()I
    .locals 1

    const-string v0, "annotation_image_height"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public zzrU()Landroid/net/Uri;
    .locals 1

    const-string v0, "annotation_image_uri"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->zzbW(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public zzrV()Landroid/os/Bundle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v1, p0, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->zzaoD:Ljava/util/ArrayList;

    const-string v2, "annotation_modifiers"

    iget v3, p0, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->zzYs:I

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/appcontent/AppContentUtils;->zzd(Lcom/google/android/gms/common/data/DataHolder;Ljava/util/ArrayList;Ljava/lang/String;I)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public zzrW()I
    .locals 1

    const-string v0, "annotation_image_width"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->getInteger(Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public zzrX()Ljava/lang/String;
    .locals 1

    const-string v0, "annotation_layout_slot"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzrY()Lcom/google/android/gms/games/appcontent/AppContentAnnotation;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/appcontent/AppContentAnnotationEntity;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/appcontent/AppContentAnnotationEntity;-><init>(Lcom/google/android/gms/games/appcontent/AppContentAnnotation;)V

    return-object v0
.end method
