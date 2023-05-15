<template>
  <div class="container_main">
    <div class="npc1" @click="showModal">
      <img src="../../assets/images/npc1.png" />
    </div>

    <div class="kirby" ref="kirby_position">
      <img src="../../assets/images/kirby_org.png" />
    </div>

    <!-- messageModal -->
    <MessageModal v-if="modalOpen">
      <template #contents>
        <div :style="`margin: 25px 30px`">
          <div :style="`margin-bottom: 10px`">
            성에 들어가려면 아이디가 있어야해. 아이디를 말해줘
          </div>
          <div class="select" id="toSignUp" :style="`margin-bottom: 3px`">
            <img src="../../assets/images/select_btn.png"/>
            아이디..? 없는데...
          </div>
          <div class="select" id="toLogin">
            <img src="../../assets/images/select_btn.png" />
            어디다가 입력하면 되는거야?
          </div>
        </div>
      </template>
    </MessageModal>
  </div>
</template>

<script>
import MessageModal from "@/components/modal/MessageModal";

export default {
  name: 'UserMain',

  components: {
    MessageModal
  },

  data: function() {
    return {
      modalOpen: false
    }
  },

  methods: {
    showModal() {
      this.modalOpen = true;
    }
  }

  // data() {
  //   return {
  //     kirby_position_top: '',
  //     kirby_position_left: ''
  //   }
  // },
  //
  // methods: {
  //   movePosition: function () {
  //     let kirbyTop = this.$refs.kirby_position.offsetTop;
  //     let kirbyLeft = this.$refs.kirby_position.offsetLeft;
  //
  //     this.kirby_position_top = `${kirbyTop}px`;
  //     this.kirby_position_left = `${kirbyLeft}px`;
  //
  //     document.addEventListener("keydown", (e) => {
  //       if (e.keyCode === 37) {
  //         this.kirby_position_left = `${kirbyLeft}px + 10px`;
  //         this.kirby_position_top = `${kirbyTop}px`;
  //         console.log('이벤트!')
  //       }
  //     });
  //
  //     console.log('kirbyTop', kirbyTop);
  //     console.log('kirbyLeft', kirbyLeft);
  //   }
  // },
  //
  // mounted() {
  //   this.movePosition()
  // }
}
</script>