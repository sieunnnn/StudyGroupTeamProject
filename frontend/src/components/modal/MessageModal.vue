
<!-- 대화 창 -->
<template>
  <div class="modal_mask">
    <div class="container_message_modal">
      <slot name="contents" />
    </div>
  </div>
</template>

<script>
export default {
  name: 'MessageModal'
}
</script>