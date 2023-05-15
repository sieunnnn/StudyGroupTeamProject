<template>
  <div class="container_frame">
    <div class="nintendo_frame">
      <div class="nintendo_top_frame">
        <NintendoTopFrame />
      </div>
      <div class="nintendo_bottom_frame">
        <NintendoBottomFrame />
      </div>
    </div>
  </div>
</template>

<script>
import NintendoTopFrame from '@/portal/frame/NintendoTopFrame'
import NintendoBottomFrame from '@/portal/frame/NintendoBottomFrame'
export default {
  name: 'NintendoFrame',
  components: {
    NintendoTopFrame,
    NintendoBottomFrame
  }
}
</script>

<style lang="css">
@import "../../assets/css/common.css";
@import "../../assets/css/user.css";
</style>