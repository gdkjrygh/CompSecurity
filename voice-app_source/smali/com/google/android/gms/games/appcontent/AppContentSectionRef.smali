.class public final Lcom/google/android/gms/games/appcontent/AppContentSectionRef;
.super Lcom/google/android/gms/games/appcontent/MultiDataBufferRef;

# interfaces
.implements Lcom/google/android/gms/games/appcontent/AppContentSection;


# instance fields
.field private final zzaoG:I


# direct methods
.method constructor <init>(Ljava/util/ArrayList;II)V
    .locals 1
    .param p2, "dataRow"    # I
    .param p3, "numChildren"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/common/data/DataHolder;",
            ">;II)V"
        }
    .end annotation

    .prologue
    .local p1, "dataHolderCollection":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/google/android/gms/common/data/DataHolder;>;"
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/games/appcontent/MultiDataBufferRef;-><init>(Ljava/util/ArrayList;II)V

    iput p3, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzaoG:I

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
    invoke-static {p0, p1}, Lcom/google/android/gms/games/appcontent/AppContentSectionEntity;->zza(Lcom/google/android/gms/games/appcontent/AppContentSection;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic freeze()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzsl()Lcom/google/android/gms/games/appcontent/AppContentSection;

    move-result-object v0

    return-object v0
.end method

.method public synthetic getActions()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzsm()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v1, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzaoD:Ljava/util/ArrayList;

    const-string v2, "section_data"

    iget v3, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzYs:I

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/appcontent/AppContentUtils;->zzd(Lcom/google/android/gms/common/data/DataHolder;Ljava/util/ArrayList;Ljava/lang/String;I)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "section_id"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    const-string v0, "section_title"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    const-string v0, "section_type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/appcontent/AppContentSectionEntity;->zza(Lcom/google/android/gms/games/appcontent/AppContentSection;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/games/appcontent/AppContentSectionEntity;->zzb(Lcom/google/android/gms/games/appcontent/AppContentSection;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1
    .param p1, "dest"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzsl()Lcom/google/android/gms/games/appcontent/AppContentSection;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/games/appcontent/AppContentSectionEntity;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/games/appcontent/AppContentSectionEntity;->writeToParcel(Landroid/os/Parcel;I)V

    return-void
.end method

.method public zzrP()Ljava/lang/String;
    .locals 1

    const-string v0, "section_content_description"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic zzrZ()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzsn()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public zzsb()Ljava/lang/String;
    .locals 1

    const-string v0, "section_subtitle"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic zzsj()Ljava/util/List;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzso()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public zzsk()Ljava/lang/String;
    .locals 1

    const-string v0, "section_card_type"

    invoke-virtual {p0, v0}, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public zzsl()Lcom/google/android/gms/games/appcontent/AppContentSection;
    .locals 1

    new-instance v0, Lcom/google/android/gms/games/appcontent/AppContentSectionEntity;

    invoke-direct {v0, p0}, Lcom/google/android/gms/games/appcontent/AppContentSectionEntity;-><init>(Lcom/google/android/gms/games/appcontent/AppContentSection;)V

    return-object v0
.end method

.method public zzsm()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/games/appcontent/AppContentAction;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v1, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzaoD:Ljava/util/ArrayList;

    const-string v2, "section_actions"

    iget v3, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzYs:I

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/appcontent/AppContentUtils;->zza(Lcom/google/android/gms/common/data/DataHolder;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public zzsn()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/games/appcontent/AppContentAnnotation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    iget-object v1, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzaoD:Ljava/util/ArrayList;

    const-string v2, "section_annotations"

    iget v3, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzYs:I

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/games/appcontent/AppContentUtils;->zzb(Lcom/google/android/gms/common/data/DataHolder;Ljava/util/ArrayList;Ljava/lang/String;I)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public zzso()Ljava/util/ArrayList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/games/appcontent/AppContentCard;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    iget v0, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzaoG:I

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v0, 0x0

    :goto_0
    iget v2, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzaoG:I

    if-ge v0, v2, :cond_0

    new-instance v2, Lcom/google/android/gms/games/appcontent/AppContentCardRef;

    iget-object v3, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzaoD:Ljava/util/ArrayList;

    iget v4, p0, Lcom/google/android/gms/games/appcontent/AppContentSectionRef;->zzYs:I

    add-int/2addr v4, v0

    invoke-direct {v2, v3, v4}, Lcom/google/android/gms/games/appcontent/AppContentCardRef;-><init>(Ljava/util/ArrayList;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
