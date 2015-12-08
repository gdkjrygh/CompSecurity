.class public Lcom/google/android/gms/drive/query/internal/InFilter;
.super Lcom/google/android/gms/drive/query/internal/AbstractFilter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/drive/query/internal/AbstractFilter;"
    }
.end annotation


# static fields
.field public static final CREATOR:Lcom/google/android/gms/drive/query/internal/zzj;


# instance fields
.field final zzCY:I

.field final zzahR:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field private final zzaie:Lcom/google/android/gms/drive/metadata/zzb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/drive/metadata/zzb",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/drive/query/internal/zzj;

    invoke-direct {v0}, Lcom/google/android/gms/drive/query/internal/zzj;-><init>()V

    sput-object v0, Lcom/google/android/gms/drive/query/internal/InFilter;->CREATOR:Lcom/google/android/gms/drive/query/internal/zzj;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V
    .locals 1
    .param p1, "versionCode"    # I
    .param p2, "value"    # Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .prologue
    .local p0, "this":Lcom/google/android/gms/drive/query/internal/InFilter;, "Lcom/google/android/gms/drive/query/internal/InFilter<TT;>;"
    invoke-direct {p0}, Lcom/google/android/gms/drive/query/internal/AbstractFilter;-><init>()V

    iput p1, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->zzCY:I

    iput-object p2, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->zzahR:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    invoke-static {p2}, Lcom/google/android/gms/drive/query/internal/zze;->zzb(Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;)Lcom/google/android/gms/drive/metadata/MetadataField;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/drive/metadata/zzb;

    iput-object v0, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->zzaie:Lcom/google/android/gms/drive/metadata/zzb;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField",
            "<TT;>;TT;)V"
        }
    .end annotation

    .prologue
    .local p0, "this":Lcom/google/android/gms/drive/query/internal/InFilter;, "Lcom/google/android/gms/drive/query/internal/InFilter<TT;>;"
    .local p1, "field":Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField;, "Lcom/google/android/gms/drive/metadata/SearchableCollectionMetadataField<TT;>;"
    .local p2, "value":Ljava/lang/Object;, "TT;"
    const/4 v0, 0x1

    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->zza(Lcom/google/android/gms/drive/metadata/MetadataField;Ljava/lang/Object;)Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/drive/query/internal/InFilter;-><init>(ILcom/google/android/gms/drive/metadata/internal/MetadataBundle;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->zzahR:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    iget-object v1, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->zzaie:Lcom/google/android/gms/drive/metadata/zzb;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;->zza(Lcom/google/android/gms/drive/metadata/MetadataField;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0
    .param p1, "out"    # Landroid/os/Parcel;
    .param p2, "flags"    # I

    .prologue
    .local p0, "this":Lcom/google/android/gms/drive/query/internal/InFilter;, "Lcom/google/android/gms/drive/query/internal/InFilter<TT;>;"
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/drive/query/internal/zzj;->zza(Lcom/google/android/gms/drive/query/internal/InFilter;Landroid/os/Parcel;I)V

    return-void
.end method

.method public zza(Lcom/google/android/gms/drive/query/internal/zzf;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<F:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/drive/query/internal/zzf",
            "<TF;>;)TF;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/drive/query/internal/InFilter;->zzaie:Lcom/google/android/gms/drive/metadata/zzb;

    invoke-virtual {p0}, Lcom/google/android/gms/drive/query/internal/InFilter;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/drive/query/internal/zzf;->zzb(Lcom/google/android/gms/drive/metadata/zzb;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
