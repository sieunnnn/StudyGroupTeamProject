<template>
  <div class="container_main">
    <div
      class="npc1"
      @click="showModal"
    >
      <img src="../../assets/images/npc1.png">
    </div>

    <div
      ref="kirby_position"
      class="kirby"
    >
      <img src="../../assets/images/kirby_org.png">
    </div>

    <!-- messageModal -->
    <MessageModal v-if="modalOpen">
      <template #character>
        <img
          src="../../assets/images/npc1_m.png"
          class="npc1_m"
        >
      </template>
      <template #contents>
        <div :style="`margin: 25px 30px`">
          <div :style="`margin-bottom: 10px`">
            성에 들어가려면 아이디가 있어야해. 아이디를 말해줘
          </div>

          <router-link to="/user/signup">
            <div
              id="toSignUp"
              class="select"
              :style="`margin-bottom: 3px`"
              @click="showSignupModal"
            >
              <img src="../../assets/images/select_btn.png">
              아이디..? 없는데...
            </div>
          </router-link>

          <router-link to="/user/login">
            <div
              id="toLogin"
              class="select"
              @click="showLoginModal"
            >
              <img src="../../assets/images/select_btn.png">
              어디다가 입력하면 되는거야?
            </div>
          </router-link>
        </div>
      </template>
    </MessageModal>

    <!-- messageModal -->
    <MessageModal v-if="signUpModalOpen">
      <template #character>
        <img
          src="../../assets/images/npc1_m.png"
          class="npc1_m_2"
        >
      </template>
      <template #contents>
        <div :style="`margin: 40px 30px; font-size: 12px`">
          <div :style="`margin-bottom: 3px`">
            아래 회원가입 란을 띄어놨으니 얼른 적어줘~
          </div>
          <div>빠진거 없는지 꼼꼼히 확인 하는것도 잊지마!</div>
        </div>
      </template>
    </MessageModal>

    <!-- messageModal -->
    <MessageModal v-if="loginModalOpen">
      <template #character>
        <img
          src="../../assets/images/npc1_m.png"
          class="npc1_m_2"
        >
      </template>
      <template #contents>
        <div :style="`margin: 30px 30px; font-size: 12px`">
          <div :style="`margin-bottom: 3px`">
            어쩐지~ 어디서 본 듯 했단 말이지...
          </div>
          <div :style="`margin-bottom: 3px`">
            늘 그랬듯이 아래에다 적어주면 된다구. 엣헴!
          </div>
          <div>
            오늘도 공부 화이팅 하자고! 항상 응원해! 엣헴... 쑥스럽구만.
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
      modalOpen: false,
      signUpModalOpen: false,
      loginModalOpen: false
    }
  },

  methods: {
    showModal() {
      this.modalOpen = true;
    },

    showSignupModal() {
      this.modalOpen = false;
      this.signUpModalOpen = true;
    },

    showLoginModal() {
      this.modalOpen = false;
      this.signUpModalOpen = false;
      this.loginModalOpen = true;
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