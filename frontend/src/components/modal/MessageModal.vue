
<!-- 대화 창 -->
<template>
  <div class="modal_mask">
    <div>
      <div class="container_message_modal">
        <slot name="contents">
        </slot>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: 'MessageModal'
}
</script>

<style lang="css">
@import "../../assets/css/modal.css";
</style>